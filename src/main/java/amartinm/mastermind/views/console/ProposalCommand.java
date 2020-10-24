package amartinm.mastermind.views.console;

import amartinm.mastermind.controllers.PlayController;
import amartinm.mastermind.models.ProposedCombination;

class ProposalCommand extends Command {


    ProposalCommand(PlayController playController) {
        super(MessageView.ACTION_COMMAND.getMessage(), playController);
    }

    @Override
    protected void execute() {
        ProposedCombination proposedCombination = new ProposedCombination();
        ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
        proposedCombinationView.read();
        this.playController.addProposedCombination(proposedCombination);
        new GameView(this.playController).write();
        if (this.playController.isWinner()) {
            MessageView.WINNER.writeln();
        } else if (this.playController.isLooser()) {
            MessageView.LOOSER.writeln();
        }
    }

    @Override
    protected boolean isActive() {
        return true;
    }

}
