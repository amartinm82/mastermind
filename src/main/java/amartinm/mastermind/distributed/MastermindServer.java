package amartinm.mastermind.distributed;

import amartinm.mastermind.distributed.dispatchers.DispatcherPrototype;

public class MastermindServer {

    private final DispatcherPrototype dispatcherPrototype;

    private MastermindServer() {
        this.dispatcherPrototype = new DispatcherPrototype();
        LogicServer logic = new LogicServer(true);
        logic.createDispatchers(this.dispatcherPrototype);
    }

    private void serve() {
        this.dispatcherPrototype.serve();
    }

    public static void main(String[] args) {
        new MastermindServer().serve();
    }
}
