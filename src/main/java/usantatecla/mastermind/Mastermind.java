package usantatecla.mastermind;

import usantatecla.mastermind.controllers.Controller;
import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.views.View;

public abstract class Mastermind {

    private final Logic logic;
    private final View view;

    protected Mastermind() {
        this.logic = new Logic();
        this.view = this.createView();
    }

    protected abstract View createView();

    protected void play() {
        Controller controller;
        do {
            controller = this.logic.getController();
            if (controller != null) {
                this.view.interact(controller);
            }
        } while (controller != null);
    }

}
