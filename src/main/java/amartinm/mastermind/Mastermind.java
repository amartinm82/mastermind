package amartinm.mastermind;

import amartinm.mastermind.controllers.UseCaseController;
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
        UseCaseController controller;
        do {
            controller = this.logic.getController();
            if (controller != null) {
                this.view.interact(controller);
            }
        } while (controller != null);
    }

}
