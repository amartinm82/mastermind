package usantatecla.mastermind.views.graphics;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.controllers.ResumeController;

public class View extends usantatecla.mastermind.views.View {

    public View(PlayController playController, ResumeController resumeController) {
    }

    @Override
    protected void start() {
    }

    @Override
    protected boolean play() {
        return true;
    }

    @Override
    protected boolean isNewGame() {
        return false;
    }

}
