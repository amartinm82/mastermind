package amartinm.mastermind.views.console;

import amartinm.mastermind.views.View;
import amartinm.mastermind.views.ViewFactory;

public class ConsoleViewFactory implements ViewFactory {

    public View createStartView() {
        return new StartView();
    }

    public View createPlayView() {
        return new PlayView();
    }

    public View createProposedCombinationView() {
        return new ProposedCombinationView();
    }

    public View createResumeView() {
        return new ResumeView();
    }

}
