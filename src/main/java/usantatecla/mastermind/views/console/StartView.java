package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.StartController;

class StartView {

    protected void interact(StartController startController) {
        MessageView.TITLE.writeln();
        new SecretCombinationView().writeln();
        startController.next();
    }

}
