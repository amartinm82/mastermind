package usantatecla.mastermind.views;

public abstract class View {

    public void interact() {
        boolean newGame;
        do {
            this.start();
            boolean finished;
            do {
                finished = this.play();
            } while (!finished);
            newGame = this.isNewGame();
        } while (newGame);
    }

    protected abstract void start();

    protected abstract boolean play();

    protected abstract boolean isNewGame();

}
