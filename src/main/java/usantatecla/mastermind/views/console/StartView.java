package usantatecla.mastermind.views.console;

class StartView {

    protected void interact() {
        MessageView.TITLE.writeln();
        new SecretCombinationView().writeln();
    }

}
