package amartinm.mastermind;

public class MachineMakerPlayer extends MachinePlayer implements IMakerPlayer {

    public String checkCombination(Combination combination) {
        return this.getCombination().getCombinationResult(combination);
    }
}
