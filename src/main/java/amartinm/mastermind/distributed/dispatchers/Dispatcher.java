package amartinm.mastermind.distributed.dispatchers;

import amartinm.mastermind.controllers.AcceptorController;

public abstract class Dispatcher {

    protected final AcceptorController acceptorController;
    protected TCPIP tcpip;

    public Dispatcher(AcceptorController acceptorController) {
        this.acceptorController = acceptorController;
    }

    public abstract void dispatch();

    public void associate(TCPIP tcpip) {
        this.tcpip = tcpip;
    }

}
