package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.utils.YesNoDialog;

class ResumeView {

    void interact(ResumeController resumeController) {
        MessageView.RESUME.write();
        boolean newGame = new YesNoDialog().read();
        if (newGame) {
            resumeController.resume();
        } else {
            resumeController.next();
        }
    }

}
