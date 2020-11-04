package amartinm.mastermind;

import amartinm.mastermind.controllers.Logic;
import amartinm.mastermind.views.graphics.GraphicsViewFactory;

public class GraphicsMastermind extends Mastermind {

    @Override
    protected Logic createLogic() {
        return new Logic(new GraphicsViewFactory());
    }

    public static void main(String[] args) {
        new GraphicsMastermind().play();
    }

}
