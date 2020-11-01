package amartinm.mastermind.controllers.implementation;

import amartinm.mastermind.controllers.ResumeController;
import amartinm.mastermind.models.Session;
import amartinm.mastermind.models.SessionImplementation;

public class ResumeControllerImplementation extends ResumeController {

    private SessionImplementation sessionImplementation;

    public ResumeControllerImplementation(Session session) {
        super(session);
        this.sessionImplementation = ((SessionImplementation) this.session);
    }

    public void resume(boolean isResumed) {
        if (isResumed) {
            this.sessionImplementation.reset();
        } else {
            this.sessionImplementation.next();
        }
    }

}
