package amartinm.mastermind.controllers;

import amartinm.mastermind.models.Session;
import amartinm.mastermind.models.SessionImplementation;

public class UndoController extends Controller {

    private SessionImplementation sessionImplementation;

    public UndoController(Session session) {
        super(session);
        this.sessionImplementation = (SessionImplementation) this.session;
    }

    public void undo() {
        this.sessionImplementation.undo();
    }

    public boolean undoable() {
        return this.sessionImplementation.undoable();
    }

}
