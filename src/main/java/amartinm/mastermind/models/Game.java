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

    public int getAttempts() {
        return this.attempts;
    }

    public ProposedCombination getProposedCombination(int position) {
        return this.proposedCombinations.get(position);
    }

    public Result getResult(int position) {
        return this.results.get(position);
    }

    public GameMemento createMemento() {
        List<ProposedCombination> proposedCombinationsCopy = new ArrayList<>();
        proposedCombinationsCopy.addAll(this.proposedCombinations);
        List<Result> resultsCopy = new ArrayList<>();
        resultsCopy.addAll(this.results);
        return new GameMemento(proposedCombinationsCopy, resultsCopy, this.attempts);
    }

    public void set(GameMemento memento) {
        this.proposedCombinations = new ArrayList<>();
        this.proposedCombinations.addAll(memento.getProposedCombinations());
        this.attempts = memento.getAttempts();
        this.results = new ArrayList<>();
        this.results.addAll(memento.getResults());
    }
}
