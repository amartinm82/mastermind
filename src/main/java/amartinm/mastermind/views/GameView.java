package amartinm.mastermind.views;

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
        int attempts = this.playController.getAttempts();
        MessageView.ATTEMPTS.writeln(attempts);
        this.secretCombinationView.writeln();
        for (int i = 0; i < attempts; i++) {
            new ProposedCombinationView(this.playController).write(playController.getProposedCombination(i));
            new ResultView(playController.getResult(i)).writeln();
        }
    }
}
