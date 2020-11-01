package amartinm.mastermind.distributed;

import amartinm.mastermind.distributed.dispatchers.FrameType;
import amartinm.mastermind.models.Session;
import amartinm.mastermind.models.StateValue;
import amartinm.utils.TCPIP;

public class SessionProxy implements Session {

    private TCPIP tcpip;

    public SessionProxy(TCPIP tcpip) {
        this.tcpip = tcpip;
    }

    public StateValue getValueState() {
        this.tcpip.send(FrameType.STATE.name());
        return StateValue.values()[this.tcpip.receiveInt()];
    }

}
