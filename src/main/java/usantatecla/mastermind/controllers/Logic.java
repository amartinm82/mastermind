package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.State;
import usantatecla.mastermind.models.StateValue;

import java.util.HashMap;
import java.util.Map;

public class Logic {

    private final State state;
    private final Map<StateValue, Controller> controllers;

    public Logic() {
        Game game = new Game();
        this.state = new State();
        this.controllers = new HashMap<>();
        this.controllers.put(StateValue.INITIAL, new StartController(game, this.state));
        this.controllers.put(StateValue.IN_GAME, new PlayController(game, this.state));
        this.controllers.put(StateValue.RESUME, new ResumeController(game, this.state));
        this.controllers.put(StateValue.EXIT, null);
    }

    public Controller getController() {
        return this.controllers.get(this.state.getValueState());
    }
}
