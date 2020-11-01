package amartinm.mastermind.controllers;

import amartinm.mastermind.distributed.dispatchers.FrameType;
import amartinm.mastermind.models.Session;

public class StartController extends AcceptorController {

    public StartController(Session session) {
        super(session);
    }

    public void start() {
        if (this.session.getTcpip() == null) {
            this.session.next();
        } else {
            this.session.getTcpip().send(FrameType.START.name());
        }
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
