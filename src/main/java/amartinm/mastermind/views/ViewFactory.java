package amartinm.mastermind.views;

public interface ViewFactory {

    View createStartView();

    View createPlayView();

    View createProposedCombinationView();

    View createResumeView();

}
