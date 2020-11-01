package amartinm.mastermind.controllers;

import amartinm.mastermind.distributed.dispatchers.TCPIP;
import amartinm.mastermind.models.Session;
import amartinm.mastermind.models.StateValue;

import java.util.HashMap;
import java.util.Map;

public class Logic {

    private final Session session;
    private final Map<StateValue, AcceptorController> acceptorControllers;
    private final TCPIP tcpip;
    protected final StartController startController;
    protected final PlayController playController;
    protected final ResumeController resumeController;

    public Logic(boolean isStandalone) {
        if (isStandalone) {
            this.tcpip = null;
        } else {
            this.tcpip = TCPIP.createClientSocket();
        }

        this.session = new Session(this.tcpip);
        this.startController = new StartController(this.session);
        this.playController = new PlayController(this.session);
        this.resumeController = new ResumeController(this.session);

        this.acceptorControllers = new HashMap<>();
        this.acceptorControllers.put(StateValue.INITIAL, this.startController);
        this.acceptorControllers.put(StateValue.IN_GAME, this.playController);
        this.acceptorControllers.put(StateValue.RESUME, this.resumeController);
        this.acceptorControllers.put(StateValue.EXIT, null);
    }

    public AcceptorController getController() {
        return this.acceptorControllers.get(this.session.getValueState());
    }

    public void close() {
        this.tcpip.close();
    }
}
