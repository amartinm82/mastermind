package amartinm.mastermind;

class Turn {

    private final int MAX_COMBINATIONS = 10;
    private int tries = 0;
    private IMakerPlayer makerPlayer;
    private IBreakerPlayer breakerPlayer;
    private CombinationResult lastCombinationResult;

    public Turn(IMakerPlayer makerPlayer, IBreakerPlayer breakerPlayer) {
        assert makerPlayer != null && breakerPlayer != null;

        this.makerPlayer = makerPlayer;
        this.breakerPlayer = breakerPlayer;
    }

    public IMakerPlayer getMakerPlayer() {
        return makerPlayer;
    }

    public IBreakerPlayer getBreakerPlayer() {
        return breakerPlayer;
    }

    public int getTries() {
        return tries;
    }

    public CombinationResult getLastCombinationResult() {
        return lastCombinationResult;
    }

    public void play() {
        Combination userCombination = this.breakerPlayer.generateCombination();
        this.lastCombinationResult = new CombinationResult(
                userCombination.toString(),
                this.makerPlayer.checkCombination(userCombination));
        tries++;
    }

    public boolean isFinishedGame() {
        return this.breakerPlayer.getCombination().equals(this.makerPlayer.getCombination())
                || MAX_COMBINATIONS < tries;
    }


}
