package amartinm.mastermind.views;

import amartinm.mastermind.controllers.StartController;

class StartView {

    protected void interact(StartController startController) {
        MessageView.TITLE.writeln();
        new SecretCombinationView().writeln();
        startController.start();
    }

}
