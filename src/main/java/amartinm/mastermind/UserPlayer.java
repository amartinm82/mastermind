package amartinm.mastermind;

public abstract class UserPlayer extends Player {

    UserPlayer() {
        this.combination = new UserCombination();
    }

}
