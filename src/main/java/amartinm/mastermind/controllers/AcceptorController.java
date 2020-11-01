package amartinm.mastermind.controllers;

import amartinm.mastermind.models.Session;

public abstract class AcceptorController extends Controller {

    AcceptorController(Session session) {
        super(session);
    }

    public abstract void accept(ControllerVisitor controllerVisitor);

}
