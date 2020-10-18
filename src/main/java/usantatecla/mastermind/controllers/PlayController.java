package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.models.Result;
import usantatecla.mastermind.models.State;

public class PlayController extends UseCaseController {

    public PlayController(Game game, State state) {
        super(game, state);
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        this.game.addProposedCombination(proposedCombination);
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

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
