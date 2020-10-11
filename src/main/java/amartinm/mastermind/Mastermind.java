package amartinm.mastermind;

import java.util.Scanner;

public class Mastermind {

    private Board board;
    private Turn turn;
    private IMakerPlayer makerPlayer;
    private IBreakerPlayer breakerPlayer;

    private void play() {
        do {
            this.playGame();
        } while (this.isResumedGame());
    }

    private void playGame() {
        this.makerPlayer = new MachineMakerPlayer();
        this.makerPlayer.getCombination().generateCombination();
        this.breakerPlayer = new UserBreakerPlayer();
        this.turn = new Turn(this.makerPlayer, this.breakerPlayer);
        this.board = new Board(turn);
        do {
            this.board.showBoard();
            this.turn.play();
        } while (!this.turn.isFinishedGame());
        this.board.writeWinner();
    }

    private boolean isResumedGame() {
        System.out.print("RESUME? (y/n): ");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        return response.equalsIgnoreCase("Y");
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }
}
