package amartinm.mastermind.controllers;

import amartinm.mastermind.models.Game;
import amartinm.mastermind.models.State;
import amartinm.mastermind.models.StateValue;
import amartinm.mastermind.views.ViewFactory;

import java.util.HashMap;
import java.util.Map;

public class Logic {

    private final State state;
    private final Map<StateValue, UseCaseController> controllers;

    public Logic(ViewFactory viewFactory) {
        Game game = new Game();
        this.state = new State();
        this.controllers = new HashMap<>();
        this.controllers.put(StateValue.INITIAL, new StartController(game, this.state, viewFactory));
        this.controllers.put(StateValue.IN_GAME, new PlayController(game, this.state, viewFactory));
        this.controllers.put(StateValue.RESUME, new ResumeController(game, this.state, viewFactory));
        this.controllers.put(StateValue.EXIT, null);
    }

    public UseCaseController getController() {
        return this.controllers.get(this.state.getValueState());
    }

}
