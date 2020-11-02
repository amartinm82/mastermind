package amartinm.mastermind.views.graphics;

import amartinm.mastermind.views.View;
import amartinm.utils.WithConsoleView;

import java.util.Collections;
import java.util.Map;

public class ResumeView extends WithConsoleView implements View {

    public static final String NEW_GAME = "newGame";

    public Map<String, Object> interact(Map<String, Object> model) {
        this.console.write("Graphics resume view\n");
        return Collections.singletonMap(NEW_GAME, false);
    }

}
