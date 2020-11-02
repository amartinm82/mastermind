package amartinm.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private static final int MAX_LONG = 10;
    private SecretCombination secretCombination;
    private List<ProposedCombination> proposedCombinations;
    private List<Result> results;
    private int attempts;

    public Game() {
        this.clear();
    }

    public List<ProposedCombination> getProposedCombinations() {
        return this.proposedCombinations;
    }

    public List<Result> getResults() {
        return this.results;
    }

    public int getAttempts() {
        return this.attempts;
    }

    public void clear() {
        this.secretCombination = new SecretCombination();
        this.proposedCombinations = new ArrayList<>();
        this.results = new ArrayList<>();
        this.attempts = 0;
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        this.proposedCombinations.add(proposedCombination);
        this.results.add(this.secretCombination.getResult(proposedCombination));
        this.attempts++;
    }

    public boolean isLooser() {
        return this.attempts == Game.MAX_LONG;
    }

    public boolean isWinner() {
        return this.results.get(this.attempts - 1).isWinner();
    }


}
