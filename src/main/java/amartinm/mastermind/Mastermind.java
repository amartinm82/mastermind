package amartinm.mastermind;

import amartinm.mastermind.controllers.AcceptorController;
import amartinm.mastermind.controllers.Logic;
import amartinm.mastermind.views.View;

public abstract class Mastermind {

    private final Logic logic;
    private final View view;

    protected Mastermind() {
        this.logic = this.createLogic();
        this.view = new View();
    }

    protected abstract Logic createLogic();

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
