package amartinm.mastermind.controllers;

import amartinm.mastermind.models.Game;
import amartinm.mastermind.models.State;
import amartinm.mastermind.models.StateValue;

import java.util.HashMap;
import java.util.Map;

public abstract class Logic {

    private final State state;
    private final Map<StateValue, UseCaseController> controllers;

    public Logic() {
        Game game = new Game();
        this.state = new State();
        this.controllers = new HashMap<>();
        this.controllers.put(StateValue.INITIAL, this.createStartController(game, this.state));
        this.controllers.put(StateValue.IN_GAME, this.createPlayController(game, this.state));
        this.controllers.put(StateValue.RESUME, this.createResumeController(game, this.state));
        this.controllers.put(StateValue.EXIT, null);
    }

    public UseCaseController getController() {
        return this.controllers.get(this.state.getValueState());
    }

    public abstract StartController createStartController(Game game, State state);

    public abstract PlayController createPlayController(Game game, State state);

    public abstract ResumeController createResumeController(Game game, State state);
}
