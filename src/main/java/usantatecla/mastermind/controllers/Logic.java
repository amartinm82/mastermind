package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.models.Result;

public class Logic {

    private PlayController playController;
    private ResumeController resumeController;

    public Logic() {
        Game game = new Game();
        this.playController = new PlayController(game);
        this.resumeController = new ResumeController(game);
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        this.playController.addProposedCombination(proposedCombination);
    }

    public int getAttempts() {
        return this.playController.getAttempts();
    }

    public ProposedCombination getProposedCombination(int position) {
        return this.playController.getProposedCombination(position);
    }

    public Result getResult(int position) {
        return this.playController.getResult(position);
    }

    public boolean isWinner() {
        return this.playController.isWinner();
    }

    public boolean isLooser() {
        return this.playController.isLooser();
    }

    public void resume() {
        this.resumeController.resume();
    }
}
