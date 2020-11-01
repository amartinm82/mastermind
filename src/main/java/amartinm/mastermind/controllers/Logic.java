package amartinm.mastermind.controllers;

import amartinm.mastermind.models.Session;
import amartinm.mastermind.models.StateValue;

import java.util.HashMap;
import java.util.Map;

public class Logic {

    protected Session session;
    protected final Map<StateValue, AcceptorController> acceptorControllers;

    public Logic() {
        this.acceptorControllers = new HashMap<>();
    }

    public AcceptorController getController() {
        return this.acceptorControllers.get(this.session.getValueState());
    }

}
