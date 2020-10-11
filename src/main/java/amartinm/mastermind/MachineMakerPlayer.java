package amartinm.mastermind;

public class MachineMakerPlayer extends MachinePlayer implements IMakerPlayer {

    public Result checkCombination(Combination combination) {
        return this.getCombination().getResult(combination);
    }
}
