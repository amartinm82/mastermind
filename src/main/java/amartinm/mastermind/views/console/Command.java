package amartinm.mastermind.views.console;

import amartinm.mastermind.controllers.PlayController;

abstract class Command extends amartinm.utils.Command {

    protected final PlayController playController;

    protected Command(String title, PlayController playController) {
        super(title);
        this.playController = playController;
    }

}
