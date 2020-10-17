package usantatecla.mastermind;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.View;

public abstract class Mastermind {

    private final View view;

    protected Mastermind() {
        Game game = new Game();
        PlayController playController = new PlayController(game);
        ResumeController resumeController = new ResumeController(game);
        this.view = this.createView(playController, resumeController);
    }

    protected abstract View createView(PlayController playController, ResumeController resumeController);

    protected void play() {
        this.view.interact();
    }

}
