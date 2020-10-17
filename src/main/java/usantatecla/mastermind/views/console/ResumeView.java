package usantatecla.mastermind.views.console;

import usantatecla.mastermind.models.Game;
import usantatecla.utils.YesNoDialog;

class ResumeView extends SubView {

    ResumeView(Game game) {
        super(game);
    }

    boolean interact() {
        MessageView.RESUME.write();
        boolean newGame = new YesNoDialog().read();
        if (newGame) {
            this.game.clear();
        }
        return newGame;
    }

}
