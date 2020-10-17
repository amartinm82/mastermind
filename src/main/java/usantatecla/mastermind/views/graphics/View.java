package usantatecla.mastermind.views.graphics;

import usantatecla.mastermind.models.Game;

public class View extends usantatecla.mastermind.views.View {

    private PlayView playView;
    private StartView startView;

    public View(Game game) {
        super(game);
        this.startView = new StartView(this.game);
        this.playView = new PlayView(this.game);
    }

    @Override
    protected void start() {
        this.startView.interact();
    }

    @Override
    protected boolean play() {
        this.startView.setVisible(false);
        return this.playView.interact();
    }

    @Override
    protected boolean isNewGame() {
        if (new ResumeView().isResumedGame()) {
            return true;
        }
        this.playView.setVisible(false);
        System.exit(0);
        return false;
    }

}
