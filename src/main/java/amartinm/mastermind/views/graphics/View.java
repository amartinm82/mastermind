package amartinm.mastermind.views.graphics;

import amartinm.mastermind.controllers.AcceptorController;

public class View extends amartinm.mastermind.views.View {

    @Override
    public void interact(AcceptorController controller) {
        controller.next();
    }

}
