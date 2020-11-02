package amartinm.mastermind.controllers;

import amartinm.mastermind.models.Game;
import amartinm.mastermind.models.State;

import java.util.Map;

public abstract class ResumeController extends UseCaseController {

    private static final String NEW_GAME = "newGame";

    public ResumeController(Game game, State state) {
        super(game, state);
    }

    private void resume() {
        this.game.clear();
        this.state.reset();
    }

    public void execute() {
        Map<String, Object> viewData = this.view.interact(null);
        boolean newGame = (boolean) viewData.get(NEW_GAME);
        if (newGame) {
            this.resume();
        } else {
            this.next();
        }
    }

}
