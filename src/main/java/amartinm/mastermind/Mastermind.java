package amartinm.mastermind;

import amartinm.mastermind.controllers.AcceptorController;
import amartinm.mastermind.controllers.Logic;
import amartinm.mastermind.views.View;

public abstract class Mastermind {

    private final Logic logic;
    private final View view;

    protected Mastermind() {
        this.logic = new Logic();
        this.view = this.createView();
    }

    protected abstract View createView();

    protected void play() {
        AcceptorController acceptorController;
        do {
            acceptorController = this.logic.getController();
            if (acceptorController != null) {
                this.view.interact(acceptorController);
            }
        } while (acceptorController != null);
    }

}
