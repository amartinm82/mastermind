package amartinm.mastermind.controllers.console;

import amartinm.mastermind.controllers.AddProposalController;
import amartinm.mastermind.models.Game;
import amartinm.mastermind.models.State;
import amartinm.mastermind.views.View;
import amartinm.mastermind.views.console.ProposedCombinationView;

public class AddProposalControllerImplementation extends AddProposalController {

    public AddProposalControllerImplementation(Game game, State state) {
        super(game, state);
    }

    @Override
    public View createView() {
        return new ProposedCombinationView();
    }
}
