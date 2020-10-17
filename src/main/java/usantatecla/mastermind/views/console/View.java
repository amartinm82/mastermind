package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.Logic;

public class View extends usantatecla.mastermind.views.View {

    private final StartView startView;
    private final PlayView playView;
    private final ResumeView resumeView;

    public View(Logic logic) {
        assert logic != null;

        this.startView = new StartView();
        this.playView = new PlayView(logic);
        this.resumeView = new ResumeView(logic);
    }

    @Override
    protected void start() {
        this.startView.interact();
    }

    @Override
    protected boolean play() {
        return this.playView.interact();
    }

    @Override
    protected boolean isNewGame() {
        return this.resumeView.interact();
    }

}
