package amartinm.mastermind.views.graphics;

import amartinm.mastermind.models.Color;
import amartinm.mastermind.models.ProposedCombination;
import amartinm.mastermind.views.View;
import amartinm.utils.WithConsoleView;

import java.util.Collections;
import java.util.Map;

public class ProposedCombinationView extends WithConsoleView implements View {

    public static final String PROPOSED_COMBINATION = "proposedCombination";

    public static void write(ProposedCombination proposedCombination) {
    }

    public Map<String, Object> interact(Map<String, Object> model) {
        this.console.write("Graphics proposed combination view\n");
        ProposedCombination proposedCombination = new ProposedCombination();
        for (Color color : Color.values()) {
            proposedCombination.getColors().add(color);
        }
        return Collections.singletonMap(PROPOSED_COMBINATION, proposedCombination);
    }

}
