package amartinm.mastermind.controllers;

import amartinm.mastermind.models.Game;
import amartinm.mastermind.models.State;

public abstract class UseCaseController {

    protected final Game game;
    protected final State state;

    UseCaseController(Game game, State state) {
        this.game = game;
        this.state = state;
    }

    public void next() {
        this.state.next();
    }

    public abstract void accept(ControllerVisitor controllerVisitor);

}
