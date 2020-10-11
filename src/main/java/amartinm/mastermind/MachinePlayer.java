package amartinm.mastermind;

public abstract class MachinePlayer extends Player {

    MachinePlayer() {
        this.combination = new RandomCombination();
    }

}
