package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.utils.YesNoDialog;

class ResumeView {

    private final ResumeController resumeController;

    ResumeView(ResumeController resumeController) {
        assert resumeController != null;

        this.resumeController = resumeController;
    }

    boolean interact() {
        MessageView.RESUME.write();
        boolean newGame = new YesNoDialog().read();
        if (newGame) {
            this.resumeController.resume();
        }
        return newGame;
    }

}
