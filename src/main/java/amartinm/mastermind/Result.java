package amartinm.mastermind;

public class Result {

    private String combination;
    private int blacks;
    private int whites;

    public Result(String combination, int blacks, int whites) {
        assert combination != null && blacks > -1 && whites > -1;

        this.combination = combination;
        this.blacks = blacks;
        this.whites = whites;
    }

    public boolean isWinnerResult() {
        return blacks == Combination.MAX_SIZE;
    }

    @Override
    public String toString() {
        return String.format("%s --> %d blacks and %d whites", this.combination, this.blacks, this.whites);
    }
}
