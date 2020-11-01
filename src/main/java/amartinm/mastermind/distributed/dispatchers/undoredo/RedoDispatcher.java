package amartinm.mastermind.distributed.dispatchers.undoredo;

import amartinm.mastermind.controllers.PlayController;
import amartinm.mastermind.distributed.dispatchers.Dispatcher;

public class RedoDispatcher extends Dispatcher {

    public RedoDispatcher(PlayController playController) {
        super(playController);
    }

    @Override
    public void dispatch() {
        ((PlayController) this.acceptorController).redo();
    }

}
