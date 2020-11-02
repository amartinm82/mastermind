package amartinm.mastermind.controllers.graphics;

import amartinm.mastermind.controllers.ResumeController;
import amartinm.mastermind.models.Game;
import amartinm.mastermind.models.State;
import amartinm.mastermind.views.View;
import amartinm.mastermind.views.graphics.ResumeView;

public class ResumeControllerImplementation extends ResumeController {

    public ResumeControllerImplementation(Game game, State state) {
        super(game, state);
    }

    @Override
    public View createView() {
        return new ResumeView();
    }

}
