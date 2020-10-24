package amartinm.mastermind.views.console;

import amartinm.mastermind.controllers.PlayController;

class PlayView {

    void interact(PlayController playController) {
        new PlayMenu(playController).execute();
    }

}
