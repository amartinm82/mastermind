package amartinm.mastermind.controllers;

import amartinm.mastermind.distributed.dispatchers.FrameType;
import amartinm.mastermind.models.Error;
import amartinm.mastermind.models.ProposedCombination;
import amartinm.mastermind.models.Result;
import amartinm.mastermind.models.Session;

public class PlayController extends AcceptorController {

    private ProposalController proposalController;
    private UndoController undoController;
    private RedoController redoController;

    public PlayController(Session session) {
        super(session);
        if (this.session.getTcpip() == null) {
            this.proposalController = new ProposalController(session);
            this.undoController = new UndoController(session);
            this.redoController = new RedoController(session);
        }
    }

    public Error isCombinationValid(String characters) {
        if (this.session.getTcpip() == null) {
            return this.proposalController.isCombinationValid(characters);
        }
        this.session.getTcpip().send(FrameType.COMBINATION_VALID.name());
        this.session.getTcpip().send(characters);
        return this.session.getTcpip().receiveError();
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        if (this.session.getTcpip() == null) {
            this.proposalController.addProposedCombination(proposedCombination);
        } else {
            this.session.getTcpip().send(FrameType.ADD_PROPOSAL.name());
            this.session.getTcpip().send(proposedCombination.toString());
        }
    }

    public int getAttempts() {
        if (this.session.getTcpip() == null) {
            return this.proposalController.getAttempts();
        }
        this.session.getTcpip().send(FrameType.GET_ATTEMPTS.name());
        return this.session.getTcpip().receiveInt();
    }

    public ProposedCombination getProposedCombination(int position) {
        if (this.session.getTcpip() == null) {
            return this.proposalController.getProposedCombination(position);
        }
        this.session.getTcpip().send(FrameType.GET_PROPOSAL.name());
        this.session.getTcpip().send(position);
        return this.session.getTcpip().receiveProposedCombination();
    }

    public Result getResult(int position) {
        if (this.session.getTcpip() == null) {
            return this.proposalController.getResult(position);
        }
        this.session.getTcpip().send(FrameType.GET_RESULT.name());
        this.session.getTcpip().send(position);
        return this.session.getTcpip().receiveResult();
    }

    public boolean isWinner() {
        if (this.session.getTcpip() == null) {
            return this.proposalController.isWinner();
        }
        this.session.getTcpip().send(FrameType.WINNER.name());
        return this.session.getTcpip().receiveBoolean();
    }

    public boolean isLooser() {
        if (this.session.getTcpip() == null) {
            return this.proposalController.isLooser();
        }
        this.session.getTcpip().send(FrameType.LOOSER.name());
        return this.session.getTcpip().receiveBoolean();
    }

    public void undo() {
        if (this.session.getTcpip() == null) {
            this.undoController.undo();
        } else {
            this.session.getTcpip().send(FrameType.UNDO.name());
        }
    }

    public boolean undoable() {
        if (this.session.getTcpip() == null) {
            return this.undoController.undoable();
        }
        this.session.getTcpip().send(FrameType.UNDOABLE.name());
        return this.session.getTcpip().receiveBoolean();
    }

    public void redo() {
        if (this.session.getTcpip() == null) {
            this.redoController.redo();
        } else {
            this.session.getTcpip().send(FrameType.REDO.name());
        }
    }

    public boolean redoable() {
        if (this.session.getTcpip() == null) {
            return this.redoController.redoable();
        }
        this.session.getTcpip().send(FrameType.REDOABLE.name());
        return this.session.getTcpip().receiveBoolean();
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
