package amartinm.mastermind.controllers;

import amartinm.mastermind.models.Game;
import amartinm.mastermind.models.State;

public abstract class StartController extends UseCaseController {

    public StartController(Game game, State state) {
        super(game, state);
    }

    @Override
    public void execute() {
        this.view.interact(null);
        this.next();
    }
}
