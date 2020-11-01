package amartinm.mastermind.distributed.dispatchers.undoredo;

import amartinm.mastermind.controllers.PlayController;
import amartinm.mastermind.distributed.dispatchers.Dispatcher;

public class UndoDispatcher extends Dispatcher {

    public UndoDispatcher(PlayController playController) {
        super(playController);
    }

    @Override
    public void dispatch() {
        ((PlayController) this.acceptorController).undo();
    }

}
