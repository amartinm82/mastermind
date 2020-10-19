package amartinm.mastermind.views.console;

import amartinm.mastermind.controllers.ResumeController;
import amartinm.utils.YesNoDialog;

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
