package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.utils.Console;

class PlayView extends SubView {

    private final SecretCombinationView secretCombinationView;
    private final Console console;

    PlayView(Logic logic) {
        super(logic);
        this.secretCombinationView = new SecretCombinationView();
        this.console = new Console();
    }

    boolean interact() {
        ProposedCombination proposedCombination = new ProposedCombination();
        ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
        proposedCombinationView.read();
        this.logic.addProposedCombination(proposedCombination);
        this.console.writeln();
        MessageView.ATTEMPTS.writeln(this.logic.getAttempts());
        this.secretCombinationView.writeln();
        for (int i = 0; i < this.logic.getAttempts(); i++) {
            new ProposedCombinationView(this.logic.getProposedCombination(i)).write();
            new ResultView(this.logic.getResult(i)).writeln();
        }
        if (this.logic.isWinner()) {
            MessageView.WINNER.writeln();
            return true;
        } else if (this.logic.isLooser()) {
            MessageView.LOOSER.writeln();
            return true;
        }
        return false;
    }

}
