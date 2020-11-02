package amartinm.mastermind.views.console;

import amartinm.mastermind.models.Color;
import amartinm.mastermind.models.Combination;
import amartinm.mastermind.models.Error;
import amartinm.mastermind.models.ProposedCombination;
import amartinm.mastermind.views.View;
import amartinm.utils.WithConsoleView;

import java.util.Collections;
import java.util.Map;

public class ProposedCombinationView extends WithConsoleView implements View {

    private static final String PROPOSED_COMBINATION = "proposedCombination";

    public static void write(ProposedCombination proposedCombination) {
        for (Color color : proposedCombination.getColors()) {
            new ColorView(color).write();
        }
    }

    public Map<String, Object> interact(Map<String, Object> model) {
        ProposedCombination proposedCombination = new ProposedCombination();
        Error error;
        do {
            error = null;
            MessageView.PROPOSED_COMBINATION.write();
            String characters = this.console.readString();
            if (characters.length() != Combination.getWidth()) {
                error = Error.WRONG_LENGTH;
            } else {
                for (int i = 0; i < characters.length(); i++) {
                    Color color = ColorView.getInstance(characters.charAt(i));
                    if (color == null) {
                        error = Error.WRONG_CHARACTERS;
                    } else {
                        if (proposedCombination.getColors().contains(color)) {
                            error = Error.DUPLICATED;
                        } else {
                            proposedCombination.getColors().add(color);
                        }
                    }
                }
            }
            if (error != null) {
                new ErrorView(error).writeln();
                proposedCombination.getColors().clear();
            }
        } while (error != null);
        return Collections.singletonMap(PROPOSED_COMBINATION, proposedCombination);
    }

}
