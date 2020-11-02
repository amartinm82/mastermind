package amartinm.mastermind.views.console;

import amartinm.mastermind.views.View;
import amartinm.utils.YesNoDialog;

import java.util.Collections;
import java.util.Map;

public class ResumeView implements View {

    private static final String NEW_GAME = "newGame";

    public Map<String, Object> interact(Map<String, Object> model) {
        MessageView.RESUME.write();
        boolean newGame = new YesNoDialog().read();
        return Collections.singletonMap(NEW_GAME, newGame);
    }

}
