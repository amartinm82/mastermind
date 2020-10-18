package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.*;

public class View extends usantatecla.mastermind.views.View implements ControllerVisitor {

    private final StartView startView;
    private final PlayView playView;
    private final ResumeView resumeView;

    public View() {
        this.startView = new StartView();
        this.playView = new PlayView();
        this.resumeView = new ResumeView();
    }

    @Override
    public void interact(UseCaseController controller) {
        controller.accept(this);
    }

    @Override
    public void visit(StartController startController) {
        this.startView.interact(startController);
    }

    @Override
    public void visit(PlayController playController) {
        this.playView.interact(playController);	}

    @Override
    public void visit(ResumeController resumeController) {
        this.resumeView.interact(resumeController);
    }
}
