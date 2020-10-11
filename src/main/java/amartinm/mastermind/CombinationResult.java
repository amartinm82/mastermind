package amartinm.mastermind;

public class CombinationResult {

    private String combination;
    private String result;

    public CombinationResult(String combination, String result) {
        assert combination != null && result != null;

        this.combination = combination;
        this.result = result;
    }

    public String getCombination() {
        return combination;
    }

    public String getResult() {
        return result;
    }
}
