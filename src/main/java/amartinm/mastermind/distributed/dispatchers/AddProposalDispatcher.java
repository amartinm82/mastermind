package amartinm.mastermind.distributed.dispatchers;

import amartinm.mastermind.controllers.PlayController;
import amartinm.mastermind.models.ProposedCombination;

public class AddProposalDispatcher extends Dispatcher {

    public AddProposalDispatcher(PlayController playController) {
        super(playController);
    }

    @Override
    public void dispatch() {
        ProposedCombination proposedCombination = this.tcpip.receiveProposedCombination();
        ((PlayController) this.acceptorController).addProposedCombination(proposedCombination);
    }

}