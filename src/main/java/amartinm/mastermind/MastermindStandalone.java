package amartinm.mastermind;

public class MastermindStandalone extends Mastermind {

    @Override
    protected boolean isStandalone() {
        return true;
    }

    public static void main(String[] args) {
        new MastermindStandalone().play();
    }

}
