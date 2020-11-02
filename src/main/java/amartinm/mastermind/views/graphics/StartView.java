package amartinm.mastermind.views.graphics;

import amartinm.mastermind.views.View;
import amartinm.utils.WithConsoleView;

import java.util.Map;

public class StartView extends WithConsoleView implements View {

    public Map<String, Object> interact(Map<String, Object> model) {
        this.console.write("Graphics start view\n");
        return null;
    }

}
