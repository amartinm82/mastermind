package amartinm.mastermind.views.graphics;

import amartinm.mastermind.views.View;
import amartinm.utils.WithConsoleView;

import java.util.Map;

public class PlayView extends WithConsoleView implements View {

    public static final String RESULTS = "results";

    public Map<String, Object> interact(Map<String, Object> model) {
        this.console.write("Graphics play view\n");
        return null;
    }

}
