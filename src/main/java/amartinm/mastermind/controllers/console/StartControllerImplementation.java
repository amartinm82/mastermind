package amartinm.mastermind.controllers.console;

import amartinm.mastermind.controllers.StartController;
import amartinm.mastermind.models.Game;
import amartinm.mastermind.models.State;
import amartinm.mastermind.views.View;
import amartinm.mastermind.views.console.StartView;

public class StartControllerImplementation extends StartController {

    public StartControllerImplementation(Game game, State state) {
        super(game, state);
    }

    @Override
    public View createView() {
        return new StartView();
    }

}
