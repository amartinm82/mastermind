package amartinm.mastermind.views.console;

import amartinm.mastermind.models.Result;

class ResultView {
	
	private final Result result;

	ResultView(Result result) {
		this.result = result;
	}

	void writeln() {
		MessageView.RESULT.writeln(this.result.getBlacks(), this.result.getWhites());
	}

}
