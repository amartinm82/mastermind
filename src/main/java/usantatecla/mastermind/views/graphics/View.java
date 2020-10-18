package usantatecla.mastermind.views.graphics;

import usantatecla.mastermind.controllers.Controller;

public class View extends usantatecla.mastermind.views.View {

    @Override
    public void interact(Controller controller) {
        controller.next();
    }
}
