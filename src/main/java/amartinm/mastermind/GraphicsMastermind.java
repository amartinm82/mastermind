package amartinm.mastermind;

import amartinm.mastermind.controllers.Logic;
import amartinm.mastermind.controllers.graphics.LogicGraphics;

public class GraphicsMastermind extends Mastermind {

    @Override
    protected Logic createLogic() {
        return new LogicGraphics();
    }

    public static void main(String[] args) {
        new GraphicsMastermind().play();
    }

}
