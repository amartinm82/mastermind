package amartinm.mastermind.views.console;

import amartinm.mastermind.controllers.PlayController;
import amartinm.utils.Console;

public class GameView {

    private final PlayController playController;
    private final SecretCombinationView secretCombinationView;

    GameView(PlayController playController) {
        this.playController = playController;
        this.secretCombinationView = new SecretCombinationView();
    }

    public void write() {
        Console.instance().writeln();
        MessageView.ATTEMPTS.writeln(this.playController.getAttempts());
        this.secretCombinationView.writeln();
        for (int i = 0; i < this.playController.getAttempts(); i++) {
            new ProposedCombinationView(playController.getProposedCombination(i)).write();
            new ResultView(playController.getResult(i)).writeln();
        }
    }
}
