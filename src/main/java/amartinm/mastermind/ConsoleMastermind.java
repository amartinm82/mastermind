package amartinm.mastermind;

import amartinm.mastermind.controllers.Logic;
import amartinm.mastermind.controllers.console.LogicConsole;

public class ConsoleMastermind extends Mastermind {

    @Override
    protected Logic createLogic() {
        return new LogicConsole();
    }

    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }

}
