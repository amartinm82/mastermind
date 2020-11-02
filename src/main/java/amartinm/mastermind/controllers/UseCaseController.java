package amartinm.mastermind.controllers;

import amartinm.mastermind.models.Game;
import amartinm.mastermind.models.State;
import amartinm.mastermind.views.View;

public abstract class UseCaseController {

    protected final Game game;
    protected final State state;
    protected final View view;

    UseCaseController(Game game, State state) {
        this.game = game;
        this.state = state;
        this.view = createView();
    }

    public abstract View createView();

    public void next() {
        this.state.next();
    }

    public abstract void execute();

}
