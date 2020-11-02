package amartinm.mastermind.controllers;

import amartinm.mastermind.models.Game;
import amartinm.mastermind.models.State;
import amartinm.mastermind.views.console.PlayView;

import java.util.HashMap;
import java.util.Map;

public abstract class PlayController extends UseCaseController {

    protected final AddProposalController addProposalController;

    public PlayController(Game game, State state) {
        super(game, state);
        this.addProposalController = createAddProposalController(game, state);
    }

    public abstract AddProposalController createAddProposalController(Game game, State state);

    @Override
    public void execute() {
        this.addProposalController.execute();

        Map<String, Object> model = new HashMap<>();
        model.put(PlayView.ATTEMPTS, this.game.getAttempts());
        model.put(PlayView.PROPOSED_COMBINATIONS, this.game.getProposedCombinations());
        model.put(PlayView.RESULTS, this.game.getResults());
        model.put(PlayView.IS_WINNER, this.game.isWinner());
        model.put(PlayView.IS_LOOSER, this.game.isLooser());
        this.view.interact(model);

        if (this.game.isWinner() || this.game.isLooser()) {
            this.next();
        }
    }

}
