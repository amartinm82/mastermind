package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.utils.Console;

class PlayView {

    private final PlayController playController;
    private final SecretCombinationView secretCombinationView;
    private final Console console;

    PlayView(PlayController playController) {
        assert playController != null;

        this.playController = playController;
        this.secretCombinationView = new SecretCombinationView();
        this.console = new Console();
    }

    boolean interact() {
        ProposedCombination proposedCombination = new ProposedCombination();
        ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
        proposedCombinationView.read();
        this.playController.addProposedCombination(proposedCombination);
        this.console.writeln();
        MessageView.ATTEMPTS.writeln(this.playController.getAttempts());
        this.secretCombinationView.writeln();
        for (int i = 0; i < this.playController.getAttempts(); i++) {
            new ProposedCombinationView(this.playController.getProposedCombination(i)).write();
            new ResultView(this.playController.getResult(i)).writeln();
        }
        if (this.playController.isWinner()) {
            MessageView.WINNER.writeln();
            return true;
        } else if (this.playController.isLooser()) {
            MessageView.LOOSER.writeln();
            return true;
        }
        return false;
    }

}
