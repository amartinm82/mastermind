package amartinm.mastermind.distributed;

import amartinm.mastermind.controllers.ResumeController;
import amartinm.mastermind.distributed.dispatchers.FrameType;
import amartinm.mastermind.models.Session;
import amartinm.utils.TCPIP;

public class ResumeControllerProxy extends ResumeController {

    private TCPIP tcpip;

    public ResumeControllerProxy(Session session, TCPIP tcpip) {
        super(session);
        this.tcpip = tcpip;
    }

    @Override
    public void resume(boolean isResumed) {
        this.tcpip.send(FrameType.NEW_GAME.name());
        this.tcpip.send(isResumed);
    }

}
