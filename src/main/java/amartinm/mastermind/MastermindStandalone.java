package amartinm.mastermind;

import amartinm.mastermind.controllers.Logic;
import amartinm.mastermind.controllers.implementation.LogicImplementation;

public class MastermindStandalone extends Mastermind {

    @Override
    protected Logic createLogic() {
        return new LogicImplementation();
    }

    public static void main(String[] args) {
        new MastermindStandalone().play();
    }

}
