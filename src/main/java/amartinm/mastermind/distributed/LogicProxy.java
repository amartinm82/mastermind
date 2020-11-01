package amartinm.mastermind.distributed;

import amartinm.mastermind.controllers.Logic;
import amartinm.mastermind.distributed.dispatchers.TCPIP;
import amartinm.mastermind.models.StateValue;

public class LogicProxy extends Logic {

    private TCPIP tcpip;

    public LogicProxy() {
        this.tcpip = TCPIP.createClientSocket();
        this.session = new SessionProxy(this.tcpip);
        this.acceptorControllers.put(StateValue.INITIAL, new StartControllerProxy(this.session, this.tcpip));
        this.acceptorControllers.put(StateValue.IN_GAME, new PlayControllerProxy(this.session, this.tcpip));
        this.acceptorControllers.put(StateValue.RESUME, new ResumeControllerProxy(this.session, this.tcpip));
        this.acceptorControllers.put(StateValue.EXIT, null);
    }

    public void close() {
        this.tcpip.close();
    }

}
