package usantatecla.mastermind.views.console;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.utils.Console;

class PlayView extends SubView {

    private SecretCombinationView secretCombinationView;
    protected Console console;

    PlayView(Game game) {
        super(game);
        this.secretCombinationView = new SecretCombinationView();
        this.console = new Console();
    }

    boolean interact() {
        ProposedCombination proposedCombination = new ProposedCombination();
        ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
        proposedCombinationView.read();
        this.game.addProposedCombination(proposedCombination);
        this.console.writeln();
        MessageView.ATTEMPTS.writeln(this.game.getAttempts());
        this.secretCombinationView.writeln();
        for (int i = 0; i < this.game.getAttempts(); i++) {
            new ProposedCombinationView(this.game.getProposedCombination(i)).write();
            new ResultView(this.game.getResult(i)).writeln();
        }
        if (this.game.isWinner()) {
            MessageView.WINNER.writeln();
            return true;
        } else if (this.game.isLooser()) {
            MessageView.LOOSER.writeln();
            return true;
        }
        return false;
    }

}
