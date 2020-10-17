package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.controllers.ResumeController;

public class View extends usantatecla.mastermind.views.View {

    private final StartView startView;
    private final PlayView playView;
    private final ResumeView resumeView;

    public View(PlayController playController, ResumeController resumeController) {
        this.startView = new StartView();
        this.playView = new PlayView(playController);
        this.resumeView = new ResumeView(resumeController);
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
