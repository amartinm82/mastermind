package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.State;

public class Controller {

    protected final Game game;
    protected final State state;

    Controller(Game game, State state) {
        this.game = game;
        this.state = state;
    }

    public void next() {
        this.state.next();
    }

}
