package amartinm.mastermind.controllers;

import amartinm.mastermind.models.Session;
import amartinm.mastermind.models.StateValue;

import java.util.HashMap;
import java.util.Map;

public class Logic {

    private final Session session;
    private final Map<StateValue, AcceptorController> controllers;

    public Logic() {
        this.session = new Session();
        this.controllers = new HashMap<>();
        this.controllers.put(StateValue.INITIAL, new StartController(this.session));
        this.controllers.put(StateValue.IN_GAME, new PlayController(this.session));
        this.controllers.put(StateValue.RESUME, new ResumeController(this.session));
        this.controllers.put(StateValue.EXIT, null);
    }

    public AcceptorController getController() {
        return this.controllers.get(this.session.getValueState());
    }
}
