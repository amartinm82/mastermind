package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.State;

public class ResumeController extends UseCaseController {

    public ResumeController(Game game, State state) {
        super(game, state);
    }

    public void resume() {
        this.game.clear();
        this.state.reset();
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
