package amartinm.mastermind.distributed.dispatchers;

import amartinm.mastermind.controllers.StartController;

public class StartDispatcher extends Dispatcher {

    public StartDispatcher(StartController startController) {
        super(startController);
    }

    @Override
    public void dispatch() {
        ((StartController) this.acceptorController).start();
    }

}
