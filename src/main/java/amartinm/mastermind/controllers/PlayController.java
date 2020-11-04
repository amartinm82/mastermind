package amartinm.mastermind.controllers;

import amartinm.mastermind.models.Game;
import amartinm.mastermind.models.State;
import amartinm.mastermind.views.ViewFactory;

import java.util.HashMap;
import java.util.Map;

public class PlayController extends UseCaseController {

    private static final String ATTEMPTS = "attempts";
    private static final String PROPOSED_COMBINATIONS = "proposedCombinations";
    private static final String RESULTS = "results";
    private static final String IS_WINNER = "isWinner";
    private static final String IS_LOOSER = "isLooser";

    protected final AddProposalController addProposalController;

    public PlayController(Game game, State state, ViewFactory viewFactory) {
        super(game, state);
        this.view = viewFactory.createPlayView();
        this.addProposalController = new AddProposalController(game, state, viewFactory);
    }

    @Override
    public void execute() {
        this.addProposalController.execute();

        Map<String, Object> model = new HashMap<>();
        model.put(ATTEMPTS, this.game.getAttempts());
        model.put(PROPOSED_COMBINATIONS, this.game.getProposedCombinations());
        model.put(RESULTS, this.game.getResults());
        model.put(IS_WINNER, this.game.isWinner());
        model.put(IS_LOOSER, this.game.isLooser());
        this.view.interact(model);

        if (this.game.isWinner() || this.game.isLooser()) {
            this.next();
        }
    }

}
