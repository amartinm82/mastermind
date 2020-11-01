package amartinm.mastermind.controllers;

import amartinm.mastermind.models.Session;
import amartinm.mastermind.models.SessionImplementation;

public class RedoController extends Controller {

    private SessionImplementation sessionImplementation;

    public RedoController(Session session) {
        super(session);
        this.sessionImplementation = (SessionImplementation) session;
    }

    public void redo() {
        this.sessionImplementation.redo();
    }

    public boolean redoable() {
        return this.sessionImplementation.redoable();
    }

}
