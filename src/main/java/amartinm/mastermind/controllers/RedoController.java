package amartinm.mastermind.controllers;

import amartinm.mastermind.models.Session;

public class RedoController extends UseCaseController {

    RedoController(Session session) {
        super(session);
    }

    public void redo() {
        this.session.redo();
    }

    public boolean redoable() {
        return this.session.redoable();
    }

}
