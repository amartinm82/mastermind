package amartinm.mastermind.distributed;

import amartinm.mastermind.distributed.dispatchers.DispatcherPrototype;

public class MastermindServer {

    private final DispatcherPrototype dispatcherPrototype;

    private MastermindServer() {
        this.dispatcherPrototype = new DispatcherPrototype();
        LogicImplementationServer logic = new LogicImplementationServer();
        logic.createDispatchers(this.dispatcherPrototype);
    }

    private void serve() {
        this.dispatcherPrototype.serve();
    }

    public static void main(String[] args) {
        new MastermindServer().serve();
    }
}
