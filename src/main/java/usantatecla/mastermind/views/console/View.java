package usantatecla.mastermind.views.console;

import usantatecla.mastermind.models.Game;

public class View extends usantatecla.mastermind.views.View {

    private StartView startView;
    private PlayView playView;
    private ResumeView resumeView;

    public View(Game game) {
        super(game);
        this.startView = new StartView(this.game);
        this.playView = new PlayView(this.game);
        this.resumeView = new ResumeView(this.game);
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
