package amartinm.mastermind.distributed.dispatchers;

import amartinm.mastermind.models.Color;
import amartinm.mastermind.models.Error;
import amartinm.mastermind.models.ProposedCombination;
import amartinm.mastermind.models.Result;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPIP extends amartinm.utils.TCPIP {

    public static TCPIP createClientSocket() {
        try {
            Socket socket = new Socket("localhost", 2020);
            System.out.println("Cliente> Establecida conexión");
            return new TCPIP(socket);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static TCPIP createServerSocket() {
        try {
            ServerSocket serverSocket = new ServerSocket(2020);
            System.out.println("Servidor> Esperando conexión...");
            Socket socket = serverSocket.accept();
            System.out.println("Servidor> Recibida conexión de " + socket.getInetAddress().getHostAddress() + ":"
                    + socket.getPort());
            return new TCPIP(serverSocket, socket);
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public TCPIP(Socket socket) {
        super(socket);
    }

    public TCPIP(ServerSocket serverSocket, Socket socket) {
        super(serverSocket, socket);
    }

    public Error receiveError() {
        String error = this.receiveLine();
        if (error.equals("null")) {
            return null;
        }
        return Error.valueOf(error);
    }

    public Result receiveResult() {
        int blacks = this.receiveInt();
        int whites = this.receiveInt();
        return new Result(blacks, whites);
    }

    public ProposedCombination receiveProposedCombination() {
        ProposedCombination proposedCombination = new ProposedCombination();
        String characters = this.receiveLine();
        for (int i = 0; i < characters.length(); i++) {
            Color color = Color.getInstance(characters.charAt(i));
            if (color == null) {
                return null;
            }
            proposedCombination.getColors().add(color);
        }
        return proposedCombination;
    }

    public void close() {
        this.send(FrameType.CLOSE.name());
        super.close();
    }

}
