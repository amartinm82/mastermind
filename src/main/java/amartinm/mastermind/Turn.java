package amartinm.mastermind;

public class Turn {

    private static final int MAX_COMBINATIONS = 10;
    private int tries = 0;
    private IMakerPlayer makerPlayer;
    private IBreakerPlayer breakerPlayer;
    private Result lastResult;

    public Turn(IMakerPlayer makerPlayer, IBreakerPlayer breakerPlayer) {
        assert makerPlayer != null && breakerPlayer != null;

        this.makerPlayer = makerPlayer;
        this.breakerPlayer = breakerPlayer;
    }

    public int getTries() {
        return tries;
    }

    public Result getLastResult() {
        return lastResult;
    }

    public void play() {
        Combination userCombination = this.breakerPlayer.generateCombination();
        this.lastResult = this.makerPlayer.checkCombination(userCombination);
        tries++;
    }

    public boolean isFinishedGame() {
        return this.lastResult.isWinnerResult()
                || MAX_COMBINATIONS < tries;
    }

}
