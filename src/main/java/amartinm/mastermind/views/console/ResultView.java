package amartinm.mastermind.views.console;

import amartinm.mastermind.models.Result;
import amartinm.utils.WithConsoleView;

class ResultView extends WithConsoleView {
	
	private final Result result;

	ResultView(Result result) {
		this.result = result;
	}

	void writeln() {
		MessageView.RESULT.writeln(this.result.getBlacks(), this.result.getWhites());
	}

}
