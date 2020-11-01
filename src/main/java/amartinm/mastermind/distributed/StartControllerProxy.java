package amartinm.mastermind.distributed;

import amartinm.mastermind.controllers.StartController;
import amartinm.mastermind.distributed.dispatchers.FrameType;
import amartinm.mastermind.models.Session;
import amartinm.utils.TCPIP;

public class StartControllerProxy extends StartController {

    private TCPIP tcpip;

    public StartControllerProxy(Session session, TCPIP tcpip) {
        super(session);
        this.tcpip = tcpip;
    }

    @Override
    public void start() {
        this.tcpip.send(FrameType.START.name());
    }

}
