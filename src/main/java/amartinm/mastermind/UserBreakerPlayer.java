package amartinm.mastermind;

public class UserBreakerPlayer extends UserPlayer implements IBreakerPlayer {

    public Combination generateCombination() {
        this.getCombination().generateCombination();
        return this.getCombination();
    }
}
