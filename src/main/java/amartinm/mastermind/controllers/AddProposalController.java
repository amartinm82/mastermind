package amartinm.mastermind.controllers;

import amartinm.mastermind.models.Game;
import amartinm.mastermind.models.ProposedCombination;
import amartinm.mastermind.models.State;

import java.util.Map;

public abstract class AddProposalController extends UseCaseController {

    private static final String PROPOSED_COMBINATION = "proposedCombination";

    public AddProposalController(Game game, State state) {
        super(game, state);
    }

    private void addProposedCombination(ProposedCombination proposedCombination) {
        this.game.addProposedCombination(proposedCombination);
    }

    @Override
    public void execute() {
        Map<String, Object> viewData = this.view.interact(null);
        this.addProposedCombination((ProposedCombination) viewData.get(PROPOSED_COMBINATION));
    }
}
