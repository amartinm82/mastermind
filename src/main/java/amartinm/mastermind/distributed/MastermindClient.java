package amartinm.mastermind.distributed;

import amartinm.mastermind.Mastermind;

public class MastermindClient extends Mastermind {

    @Override
    protected boolean isStandalone() {
        return false;
    }

    public static void main(String[] args) {
        new MastermindClient().play();
    }

}
