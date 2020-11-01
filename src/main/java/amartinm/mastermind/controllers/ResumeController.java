package amartinm.mastermind.controllers;

import amartinm.mastermind.distributed.dispatchers.FrameType;
import amartinm.mastermind.models.Session;

public class ResumeController extends AcceptorController {

    public ResumeController(Session session) {
        super(session);
    }

    public void resume(boolean isResumed) {
        if (this.session.getTcpip() == null) {
            if (isResumed) {
                this.session.reset();
            } else {
                this.session.next();
            }
        } else {
            this.session.getTcpip().send(FrameType.NEW_GAME.name());
            this.session.getTcpip().send(isResumed);
        }
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
