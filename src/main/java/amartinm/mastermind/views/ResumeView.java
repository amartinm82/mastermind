package amartinm.mastermind.views;

import amartinm.mastermind.controllers.ResumeController;
import amartinm.utils.YesNoDialog;

class ResumeView {

    void interact(ResumeController resumeController) {
        MessageView.RESUME.write();
        boolean isResumed = new YesNoDialog().read();
        resumeController.resume(isResumed);
    }

}
