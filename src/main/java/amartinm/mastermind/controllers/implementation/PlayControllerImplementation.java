package amartinm.mastermind.controllers.implementation;

import amartinm.mastermind.controllers.PlayController;
import amartinm.mastermind.controllers.ProposalController;
import amartinm.mastermind.controllers.RedoController;
import amartinm.mastermind.controllers.UndoController;
import amartinm.mastermind.models.Error;
import amartinm.mastermind.models.ProposedCombination;
import amartinm.mastermind.models.Result;
import amartinm.mastermind.models.Session;

public class PlayControllerImplementation extends PlayController {

    private ProposalController proposalController;
    private UndoController undoController;
    private RedoController redoController;

    public PlayControllerImplementation(Session session) {
        super(session);
        this.proposalController = new ProposalController(session);
        this.undoController = new UndoController(session);
        this.redoController = new RedoController(session);
    }

    public Error isCombinationValid(String characters) {
        return this.proposalController.isCombinationValid(characters);
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        this.proposalController.addProposedCombination(proposedCombination);
    }

    public int getAttempts() {
        return this.proposalController.getAttempts();
    }

    public ProposedCombination getProposedCombination(int position) {
        return this.proposalController.getProposedCombination(position);
    }

    public Result getResult(int position) {
        return this.proposalController.getResult(position);
    }

    public boolean isWinner() {
        return this.proposalController.isWinner();
    }

    public boolean isLooser() {
        return this.proposalController.isLooser();
    }

    public void undo() {
        this.undoController.undo();
    }

    public boolean undoable() {
        return this.undoController.undoable();
    }

    public void redo() {
        this.redoController.redo();
    }

    public boolean redoable() {
        return this.redoController.redoable();
    }

}
