package amartinm.mastermind;

public abstract class Player implements IPlayer {

    protected Combination combination;

    public Combination getCombination() {
        return this.combination;
    }

}
