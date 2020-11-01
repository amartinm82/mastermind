package amartinm.mastermind.models;

import amartinm.mastermind.distributed.dispatchers.FrameType;
import amartinm.utils.TCPIP;

public class Session {

    private final State state;
    private final Game game;
    private final Registry registry;
    private final TCPIP tcpip;

    public Session(TCPIP tcpip) {
        this.state = new State();
        this.game = new Game();
        this.registry = new Registry(this.game);
        this.tcpip = tcpip;
    }

    public TCPIP getTcpip() {
        return tcpip;
    }

    public void next() {
        this.state.next();
    }

    public StateValue getValueState() {
        if (this.tcpip == null) {
            return this.state.getValueState();
        }
        this.tcpip.send(FrameType.STATE.name());
        return StateValue.values()[this.tcpip.receiveInt()];
    }

    public boolean undoable() {
        return this.registry.undoable();
    }

    public boolean redoable() {
        return this.registry.redoable();
    }

    public void undo() {
        this.registry.undo();
    }

    public void redo() {
        this.registry.redo();
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        this.game.addProposedCombination(proposedCombination);
        this.registry.registry();
    }

    public int getAttempts() {
        return this.game.getAttempts();
    }

    public ProposedCombination getProposedCombination(int position) {
        return this.game.getProposedCombination(position);
    }

    public Result getResult(int position) {
        return this.game.getResult(position);
    }

    public boolean isWinner() {
        boolean isWinner = this.game.isWinner();
        if (isWinner) {
            this.next();
        }
        return isWinner;
    }

    public boolean isLooser() {
        boolean isLooser = this.game.isLooser();
        if (isLooser) {
            this.next();
        }
        return isLooser;
    }

    public void reset() {
        this.game.clear();
        this.registry.reset();
        this.state.reset();
    }

}
