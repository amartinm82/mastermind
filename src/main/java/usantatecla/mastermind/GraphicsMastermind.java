package usantatecla.mastermind;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.graphics.View;

public class GraphicsMastermind {

    private View view;

    private GraphicsMastermind() {
        this.view = new View(new Game());
    }

    private void play() {
        this.view.interact();
    }

    public static void main(String[] args) {
        new GraphicsMastermind().play();
    }

}
