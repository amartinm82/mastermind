package amartinm.mastermind.controllers.console;

import amartinm.mastermind.controllers.AddProposalController;
import amartinm.mastermind.controllers.PlayController;
import amartinm.mastermind.models.Game;
import amartinm.mastermind.models.State;
import amartinm.mastermind.views.View;
import amartinm.mastermind.views.console.PlayView;

public class PlayControllerImplementation extends PlayController {

    public PlayControllerImplementation(Game game, State state) {
        super(game, state);
    }

    @Override
    public View createView() {
        return new PlayView();
    }

    @Override
    public AddProposalController createAddProposalController(Game game, State state) {
        return new AddProposalControllerImplementation(game, state);
    }

}
