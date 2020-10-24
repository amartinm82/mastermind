package amartinm.mastermind.views.console;

import amartinm.mastermind.controllers.PlayController;

class UndoCommand extends Command {

    UndoCommand(PlayController playController) {
        super(MessageView.UNDO_COMMAND.getMessage(), playController);
    }

    protected void execute() {
        this.playController.undo();
        new GameView(this.playController).write();
    }

    protected boolean isActive() {
        return this.playController.undoable();
    }

}
