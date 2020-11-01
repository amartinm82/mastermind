package amartinm.mastermind.distributed.dispatchers;

import amartinm.mastermind.controllers.PlayController;
import amartinm.mastermind.models.Error;

public class CombinationValidDispatcher extends Dispatcher {

    public CombinationValidDispatcher(PlayController playController) {
        super(playController);
    }

    @Override
    public void dispatch() {
        String characters = this.tcpip.receiveLine();
        Error error = ((PlayController) this.acceptorController).isCombinationValid(characters);
        this.tcpip.send(error == null ? null : error.name());
    }

}