package amartinm.mastermind.views;

import amartinm.mastermind.models.SecretCombination;
import amartinm.utils.Console;

class SecretCombinationView {

    SecretCombinationView() {
        super();
    }

    void writeln() {
        for (int i = 0; i < SecretCombination.getWidth(); i++) {
            MessageView.SECRET.write();
        }
        Console.instance().writeln();
    }

}
