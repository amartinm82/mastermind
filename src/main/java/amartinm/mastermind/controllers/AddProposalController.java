package amartinm.mastermind.controllers;

import amartinm.mastermind.models.Game;
import amartinm.mastermind.models.ProposedCombination;
import amartinm.mastermind.models.State;
import amartinm.mastermind.views.console.ProposedCombinationView;

import java.util.Map;

public abstract class AddProposalController extends UseCaseController {

    public AddProposalController(Game game, State state) {
        super(game, state);
    }

    private void addProposedCombination(ProposedCombination proposedCombination) {
        this.game.addProposedCombination(proposedCombination);
    }

    @Override
    public void execute() {
        Map<String, Object> viewData = this.view.interact(null);
        this.addProposedCombination((ProposedCombination) viewData.get(ProposedCombinationView.PROPOSED_COMBINATION));
    }
}
