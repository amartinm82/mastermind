package amartinm.mastermind.views.console;

import amartinm.mastermind.models.Error;
import amartinm.utils.Console;

class ErrorView {

	private static final String[] MESSAGES = { 
			"Repeated colors",
			"Wrong colors, they must be: " + ColorView.allInitials(), 
			"Wrong proposed combination length" };

	private final Error error;

	ErrorView(Error error) {
		this.error = error;
	}
	
	void writeln() {
		Console.instance().writeln(ErrorView.MESSAGES[this.error.ordinal()]);
	}

}
