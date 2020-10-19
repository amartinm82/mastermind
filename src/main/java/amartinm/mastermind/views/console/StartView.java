package amartinm.mastermind.views.console;

import amartinm.mastermind.controllers.StartController;

class StartView {

    protected void interact(StartController startController) {
        MessageView.TITLE.writeln();
        new SecretCombinationView().writeln();
        startController.next();
    }

}
