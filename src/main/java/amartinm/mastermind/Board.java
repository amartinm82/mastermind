package amartinm.mastermind;

import java.util.LinkedList;
import java.util.List;

public class Board {

    private Turn turn;
    private List<Result> results = new LinkedList<Result>();

    public Board(Turn turn) {
        assert turn != turn;

        this.turn = turn;

        System.out.println("----- MASTERMIND -----");
    }

    public void showBoard() {
        System.out.println();
        System.out.println(this.turn.getTries() + " attempt(s):");
        System.out.println("xxxx");
        //System.out.println(this.board.getMakerPlayer().getCombination());
        if (this.turn.getLastResult() != null) {
            this.results.add(this.turn.getLastResult());
        }
        for (Result result : this.results) {
            System.out.println(result);
        }
    }

    public void writeWinner() {
        if (this.turn.getLastResult().isWinnerResult()) {
            System.out.println("You've won!!! ;-)");
        } else {
            System.out.println("You've lost!!! :-(");
        }
    }
}
