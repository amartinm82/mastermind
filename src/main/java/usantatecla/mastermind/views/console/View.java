package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.Controller;
import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.controllers.StartController;

public class View extends usantatecla.mastermind.views.View {

    private final StartView startView;
    private final PlayView playView;
    private final ResumeView resumeView;

    public View() {
        this.startView = new StartView();
        this.playView = new PlayView();
        this.resumeView = new ResumeView();
    }

    @Override
    public void interact(Controller controller) {
        if (controller instanceof StartController) {
            this.startView.interact((StartController) controller);
        } else {
            if (controller instanceof PlayController) {
                this.playView.interact((PlayController) controller);
            } else {
                this.resumeView.interact((ResumeController) controller);
            }
        }
    }

}
