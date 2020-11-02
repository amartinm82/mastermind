package amartinm.mastermind.views.console;

import amartinm.mastermind.views.View;

import java.util.Map;

public class StartView implements View {

    public Map<String, Object> interact(Map<String, Object> model) {
        MessageView.TITLE.writeln();
        new SecretCombinationView().writeln();
        return null;
    }

}
