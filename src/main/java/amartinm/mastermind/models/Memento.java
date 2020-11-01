package amartinm.mastermind.models;

import java.util.List;

public class Memento {

    private final List<ProposedCombination> proposedCombinations;
    private final List<Result> results;
    private final int attempts;

    public Memento(List<ProposedCombination> proposedCombinations, List<Result> results, int attempts) {
        this.proposedCombinations = proposedCombinations;
        this.results = results;
        this.attempts = attempts;
    }

    public List<ProposedCombination> getProposedCombinations() {
        return proposedCombinations;
    }

    public List<Result> getResults() {
        return results;
    }

    public int getAttempts() {
        return attempts;
    }

}