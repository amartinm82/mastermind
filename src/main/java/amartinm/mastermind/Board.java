package amartinm.mastermind;

import java.util.LinkedList;
import java.util.List;

public class Board {

    private Turn turn;
    private List<CombinationResult> attempsAndResults = new LinkedList<CombinationResult>();

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
        if (this.turn.getLastCombinationResult() != null) {
            this.attempsAndResults.add(this.turn.getLastCombinationResult());
        }
        for (CombinationResult cr : this.attempsAndResults) {
            System.out.println(cr.getCombination() + " --> " + cr.getResult());
        }
    }

    public void writeWinner() {
        if (this.turn.getBreakerPlayer().getCombination().equals(this.turn.getMakerPlayer().getCombination())) {
            System.out.println("You've won!!! ;-)");
        } else {
            System.out.println("You've lost!!! :-(");
        }
    }
}
