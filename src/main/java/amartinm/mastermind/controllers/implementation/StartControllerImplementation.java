package amartinm.mastermind.controllers.implementation;

import amartinm.mastermind.controllers.StartController;
import amartinm.mastermind.models.Session;
import amartinm.mastermind.models.SessionImplementation;

public class StartControllerImplementation extends StartController {

    SessionImplementation sessionImplementation;

    public StartControllerImplementation(Session session) {
        super(session);
        this.sessionImplementation = ((SessionImplementation) this.session);
    }

    @Override
    public void start() {
        this.sessionImplementation.next();
    }

}
