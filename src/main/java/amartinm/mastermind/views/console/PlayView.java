package amartinm.mastermind.views.console;

import amartinm.mastermind.models.ProposedCombination;
import amartinm.mastermind.models.Result;
import amartinm.mastermind.views.View;
import amartinm.utils.WithConsoleView;

import java.util.List;
import java.util.Map;

public class PlayView extends WithConsoleView implements View {

    private static final String ATTEMPTS = "attempts";
    private static final String PROPOSED_COMBINATIONS = "proposedCombinations";
    private static final String RESULTS = "results";
    private static final String IS_WINNER = "isWinner";
    private static final String IS_LOOSER = "isLooser";

    private final SecretCombinationView secretCombinationView;

    public PlayView() {
        super();
        this.secretCombinationView = new SecretCombinationView();
    }

    public Map<String, Object> interact(Map<String, Object> model) {
        this.console.writeln();
        int attempts = (int) model.get(ATTEMPTS);
        MessageView.ATTEMPTS.writeln(attempts);
        this.secretCombinationView.writeln();
        List<ProposedCombination> proposedCombinations = (List<ProposedCombination>) model.get(PROPOSED_COMBINATIONS);
        List<Result> results = (List<Result>) model.get(RESULTS);
        for (int i = 0; i < attempts; i++) {
            ProposedCombinationView.write(proposedCombinations.get(i));
            new ResultView(results.get(i)).writeln();
        }
        boolean isWinner = (boolean) model.get(IS_WINNER);
        boolean isLooser = (boolean) model.get(IS_LOOSER);
        if (isWinner) {
            MessageView.WINNER.writeln();
        } else if (isLooser) {
            MessageView.LOOSER.writeln();
        }
        return null;
    }

}
