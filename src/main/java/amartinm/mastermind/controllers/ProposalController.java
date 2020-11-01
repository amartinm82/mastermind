package amartinm.mastermind.controllers;

import amartinm.mastermind.models.Error;
import amartinm.mastermind.models.*;

public class ProposalController extends Controller {

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

    public Error isCombinationValid(String characters) {
        ProposedCombination proposedCombination = new ProposedCombination();
        Error error = null;
        if (characters.length() != Combination.getWidth()) {
            error = Error.WRONG_LENGTH;
        } else {
            for (int i = 0; i < characters.length(); i++) {
                Color color = Color.getInstance(characters.charAt(i));
                if (color == null) {
                    error = Error.WRONG_CHARACTERS;
                } else {
                    if (proposedCombination.getColors().contains(color)) {
                        error = Error.DUPLICATED;
                    } else {
                        proposedCombination.getColors().add(color);
                    }
                }
            }
        }
        return error;
    }

}
