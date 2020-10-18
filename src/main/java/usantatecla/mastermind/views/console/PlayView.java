package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.utils.WithConsoleView;

class PlayView extends WithConsoleView {

    private final SecretCombinationView secretCombinationView;

    PlayView() {
        super();
        this.secretCombinationView = new SecretCombinationView();
    }

    void interact(PlayController playController) {
        ProposedCombination proposedCombination = new ProposedCombination();
        ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
        proposedCombinationView.read();
        playController.addProposedCombination(proposedCombination);
        this.console.writeln();
        MessageView.ATTEMPTS.writeln(playController.getAttempts());
        this.secretCombinationView.writeln();
        for (int i = 0; i < playController.getAttempts(); i++) {
            new ProposedCombinationView(playController.getProposedCombination(i)).write();
            new ResultView(playController.getResult(i)).writeln();
        }
        if (playController.isWinner()) {
            MessageView.WINNER.writeln();
        } else if (playController.isLooser()) {
            MessageView.LOOSER.writeln();
        }
    }

}
