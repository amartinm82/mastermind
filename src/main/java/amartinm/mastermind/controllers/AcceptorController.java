package amartinm.mastermind.controllers;

public interface AcceptorController {

    void accept(ControllerVisitor controllerVisitor);

    void next();
}
