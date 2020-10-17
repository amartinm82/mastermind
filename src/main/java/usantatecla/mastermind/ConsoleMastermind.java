package usantatecla.mastermind;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.views.console.View;

public class ConsoleMastermind extends Mastermind {

    @Override
    protected View createView(PlayController playController, ResumeController resumeController) {
        return new View(playController, resumeController);
    }

    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }

}
