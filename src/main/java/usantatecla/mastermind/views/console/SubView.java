package usantatecla.mastermind.views.console;

import usantatecla.mastermind.models.Game;

public class SubView {

    protected Game game;

    protected SubView(Game game) {
        assert game != null;

        this.game = game;
    }

}
