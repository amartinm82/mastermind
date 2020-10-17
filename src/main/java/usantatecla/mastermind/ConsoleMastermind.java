package usantatecla.mastermind;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.console.View;

public class ConsoleMastermind {

    private View view;

    private ConsoleMastermind() {
        this.view = new View(new Game());
    }

    private void play() {
        this.view.interact();
    }

    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }

}
