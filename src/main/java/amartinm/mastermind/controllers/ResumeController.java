package amartinm.mastermind.controllers;

import amartinm.mastermind.models.Session;

public abstract class ResumeController extends AcceptorController {

    public ResumeController(Session session) {
        super(session);
    }

    public abstract void resume(boolean isResumed);

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
