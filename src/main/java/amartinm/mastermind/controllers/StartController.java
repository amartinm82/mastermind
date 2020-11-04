package amartinm.mastermind.controllers;

import amartinm.mastermind.models.Game;
import amartinm.mastermind.models.State;
import amartinm.mastermind.views.ViewFactory;

public class StartController extends UseCaseController {

    public StartController(Game game, State state, ViewFactory viewFactory) {
        super(game, state);
        this.view = viewFactory.createStartView();
    }

    @Override
    public void execute() {
        this.view.interact(null);
        this.next();
    }
}
