package amartinm.mastermind;

public class Result {

    private String combination;
    private String result;
    private boolean isWinnerResult;

    public Result(String combination, String result, boolean isWinnerResult) {
        assert combination != null && result != null;

        this.combination = combination;
        this.result = result;
        this.isWinnerResult = isWinnerResult;
    }

    public String getCombination() {
        return combination;
    }

    public String getResult() {
        return result;
    }

    public boolean isWinnerResult() {
        return isWinnerResult;
    }
}
