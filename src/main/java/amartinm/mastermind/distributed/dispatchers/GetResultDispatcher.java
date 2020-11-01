package amartinm.mastermind.distributed.dispatchers;

import amartinm.mastermind.controllers.PlayController;
import amartinm.mastermind.models.Result;

public class GetResultDispatcher extends Dispatcher {

    public GetResultDispatcher(PlayController playController) {
        super(playController);
    }

    @Override
    public void dispatch() {
        int position = this.tcpip.receiveInt();
        Result result = ((PlayController) this.acceptorController).getResult(position);
        this.tcpip.send(result.getBlacks());
        this.tcpip.send(result.getWhites());
    }
}
