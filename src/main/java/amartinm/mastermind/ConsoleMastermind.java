package amartinm.mastermind;

import amartinm.mastermind.controllers.Logic;
import amartinm.mastermind.views.console.ConsoleViewFactory;

public class ConsoleMastermind extends Mastermind {

    @Override
    protected Logic createLogic() {
        return new Logic(new ConsoleViewFactory());
    }

    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }

}
