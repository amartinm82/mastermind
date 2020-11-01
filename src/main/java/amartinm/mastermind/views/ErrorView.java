package amartinm.mastermind.views;

import amartinm.mastermind.models.Color;
import amartinm.mastermind.models.Error;
import amartinm.utils.Console;

class ErrorView {

    private static final String[] MESSAGES = {
            "Repeated colors",
            "Wrong colors, they must be: " + Color.allInitials(),
            "Wrong proposed combination length"};

    private final Error error;

    ErrorView(Error error) {
        this.error = error;
    }

    void writeln() {
        Console.instance().writeln(ErrorView.MESSAGES[this.error.ordinal()]);
    }

}
