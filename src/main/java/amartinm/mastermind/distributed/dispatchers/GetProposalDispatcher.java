package amartinm.mastermind.distributed.dispatchers;

import amartinm.mastermind.controllers.PlayController;

public class GetProposalDispatcher extends Dispatcher {

    public GetProposalDispatcher(PlayController playController) {
        super(playController);
    }

    @Override
    public void dispatch() {
        int position = this.tcpip.receiveInt();
        this.tcpip.send(((PlayController) this.acceptorController).getProposedCombination(position).toString());
    }
}
