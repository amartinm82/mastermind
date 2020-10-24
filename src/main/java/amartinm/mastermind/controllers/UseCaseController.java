package amartinm.mastermind.controllers;

import amartinm.mastermind.models.Session;

public abstract class UseCaseController {

    protected final Session session;

    UseCaseController(Session session) {
        this.session = session;
    }

    public void next() {
        this.session.next();
    }
}
