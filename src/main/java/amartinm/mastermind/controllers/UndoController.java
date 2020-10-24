package amartinm.mastermind.controllers;

import amartinm.mastermind.models.Session;

public class UndoController extends UseCaseController {

    UndoController(Session session) {
        super(session);
    }

    void undo() {
        this.session.undo();
    }

    boolean undoable() {
        return this.session.undoable();
    }

}
