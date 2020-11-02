package amartinm.mastermind;

import amartinm.mastermind.controllers.Logic;
import amartinm.mastermind.controllers.UseCaseController;

public abstract class Mastermind {

    protected final Logic logic;

    protected Mastermind() {
        this.logic = this.createLogic();
    }

    protected abstract Logic createLogic();

    protected void play() {
        UseCaseController controller;
        do {
            controller = this.logic.getController();
            if (controller != null) {
                controller.execute();
            }
        } while (controller != null);
    }

}
