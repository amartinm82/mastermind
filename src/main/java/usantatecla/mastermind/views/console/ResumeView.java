package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.utils.YesNoDialog;

class ResumeView extends SubView {

    ResumeView(Logic logic) {
        super(logic);
    }

    boolean interact() {
        MessageView.RESUME.write();
        boolean newGame = new YesNoDialog().read();
        if (newGame) {
            this.logic.resume();
        }
        return newGame;
    }

}
