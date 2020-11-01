package amartinm.mastermind.controllers;

import amartinm.mastermind.models.Error;
import amartinm.mastermind.models.ProposedCombination;
import amartinm.mastermind.models.Result;
import amartinm.mastermind.models.Session;

public abstract class PlayController extends AcceptorController {

    public PlayController(Session session) {
        super(session);
    }

    public abstract Error isCombinationValid(String characters);

    public abstract void addProposedCombination(ProposedCombination proposedCombination);

    public abstract int getAttempts();

    public abstract ProposedCombination getProposedCombination(int position);

    public abstract Result getResult(int position);

    public abstract boolean isWinner();

    public abstract boolean isLooser();

    public abstract void undo();

    public abstract boolean undoable();

    public abstract void redo();

    public abstract boolean redoable();

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
