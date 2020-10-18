package usantatecla.mastermind.views.graphics;

import usantatecla.mastermind.controllers.UseCaseController;

public class View extends usantatecla.mastermind.views.View {

    @Override
    public void interact(UseCaseController controller) {
        controller.next();
    }

}
