package usantatecla.mastermind.views.console;

import usantatecla.mastermind.models.Game;

class StartView extends SubView {

    StartView(Game game) {
        super(game);
    }

    protected void interact() {
        MessageView.TITLE.writeln();
        new SecretCombinationView().writeln();
    }

}
