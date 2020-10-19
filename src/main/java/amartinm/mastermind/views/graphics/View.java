package amartinm.mastermind.views.graphics;

import amartinm.mastermind.controllers.UseCaseController;

public class View extends amartinm.mastermind.views.View {

    @Override
    public void interact(UseCaseController controller) {
        controller.next();
    }

}
