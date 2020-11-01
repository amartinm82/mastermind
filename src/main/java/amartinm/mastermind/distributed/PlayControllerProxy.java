package amartinm.mastermind.distributed;

import amartinm.mastermind.controllers.PlayController;
import amartinm.mastermind.distributed.dispatchers.FrameType;
import amartinm.mastermind.models.Error;
import amartinm.mastermind.models.ProposedCombination;
import amartinm.mastermind.models.Result;
import amartinm.mastermind.models.Session;
import amartinm.utils.TCPIP;

public class PlayControllerProxy extends PlayController {

    private TCPIP tcpip;

    PlayControllerProxy(Session session, TCPIP tcpip) {
        super(session);
        this.tcpip = tcpip;
    }

    public Error isCombinationValid(String characters) {
        this.tcpip.send(FrameType.COMBINATION_VALID.name());
        this.tcpip.send(characters);
        return this.tcpip.receiveError();
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        this.tcpip.send(FrameType.ADD_PROPOSAL.name());
        this.tcpip.send(proposedCombination.toString());

    }

    public int getAttempts() {
        this.tcpip.send(FrameType.GET_ATTEMPTS.name());
        return this.tcpip.receiveInt();
    }

    public ProposedCombination getProposedCombination(int position) {
        this.tcpip.send(FrameType.GET_PROPOSAL.name());
        this.tcpip.send(position);
        return this.tcpip.receiveProposedCombination();
    }

    public Result getResult(int position) {
        this.tcpip.send(FrameType.GET_RESULT.name());
        this.tcpip.send(position);
        return this.tcpip.receiveResult();
    }

    public boolean isWinner() {
        this.tcpip.send(FrameType.WINNER.name());
        return this.tcpip.receiveBoolean();
    }

    public boolean isLooser() {
        this.tcpip.send(FrameType.LOOSER.name());
        return this.tcpip.receiveBoolean();
    }

    public void undo() {
        this.tcpip.send(FrameType.UNDO.name());
    }

    public boolean undoable() {
        this.tcpip.send(FrameType.UNDOABLE.name());
        return this.tcpip.receiveBoolean();
    }

    public void redo() {
        this.tcpip.send(FrameType.REDO.name());
    }

    public boolean redoable() {
        this.tcpip.send(FrameType.REDOABLE.name());
        return this.tcpip.receiveBoolean();
    }
}
