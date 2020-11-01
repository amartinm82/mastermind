package amartinm.mastermind.controllers;

import amartinm.mastermind.models.Session;
import amartinm.mastermind.models.StateValue;

public abstract class Controller {

    protected final Session session;

    Controller(Session session) {
        this.session = session;
    }

    public StateValue getValueState() {
        return this.session.getValueState();
    }

}