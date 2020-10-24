package amartinm.mastermind.controllers;

import amartinm.mastermind.models.ProposedCombination;
import amartinm.mastermind.models.Result;
import amartinm.mastermind.models.Session;

public class ProposalController extends UseCaseController {

    public ProposalController(Session session) {
        super(session);
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        this.session.addProposedCombination(proposedCombination);
    }

    public int getAttempts() {
        return this.session.getAttempts();
    }

    public ProposedCombination getProposedCombination(int position) {
        return this.session.getProposedCombination(position);
    }

    public Result getResult(int position) {
        return this.session.getResult(position);
    }

    public boolean isWinner() {
        return this.session.isWinner();
    }

    public boolean isLooser() {
        return this.session.isLooser();
    }

}
