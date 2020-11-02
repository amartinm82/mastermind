package amartinm.mastermind.controllers.console;

import amartinm.mastermind.controllers.Logic;
import amartinm.mastermind.controllers.PlayController;
import amartinm.mastermind.controllers.ResumeController;
import amartinm.mastermind.controllers.StartController;
import amartinm.mastermind.models.Game;
import amartinm.mastermind.models.State;

public class LogicConsole extends Logic {

    public StartController createStartController(Game game, State state) {
        return new StartControllerImplementation(game, state);
    }

    public PlayController createPlayController(Game game, State state) {
        return new PlayControllerImplementation(game, state);
    }

    public ResumeController createResumeController(Game game, State state) {
        return new ResumeControllerImplementation(game, state);
    }

}
