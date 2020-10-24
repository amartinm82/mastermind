package amartinm.mastermind.views.console;

import amartinm.mastermind.controllers.PlayController;

class RedoCommand extends Command {

    RedoCommand(PlayController playController) {
        super(MessageView.REDO_COMMAND.getMessage(), playController);
    }

    @Override
    protected void execute() {
        this.playController.redo();
        new GameView(this.playController).write();
    }

    @Override
    protected boolean isActive() {
        return this.playController.redoable();
    }

}