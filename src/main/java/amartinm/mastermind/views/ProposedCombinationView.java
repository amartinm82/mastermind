package amartinm.mastermind.views;

import amartinm.mastermind.controllers.PlayController;
import amartinm.mastermind.models.Color;
import amartinm.mastermind.models.Error;
import amartinm.mastermind.models.ProposedCombination;
import amartinm.utils.Console;

class ProposedCombinationView {

    private final PlayController playController;

    ProposedCombinationView(PlayController playController) {
        this.playController = playController;
    }

    void write(ProposedCombination proposedCombination) {
        for (Color color : proposedCombination.getColors()) {
            Console.instance().write(color.getInitial());
        }
    }

    ProposedCombination read() {
        String characters;
        Error error;
        do {
            MessageView.PROPOSED_COMBINATION.write();
            characters = Console.instance().readString();
            error = this.playController.isCombinationValid(characters);
            if (error != null) {
                new ErrorView(error).writeln();
            }
        } while (error != null);

        ProposedCombination proposedCombination = new ProposedCombination();
        for (int i = 0; i < characters.length(); i++) {
            Color color = Color.getInstance(characters.charAt(i));
            proposedCombination.getColors().add(color);
        }

        return proposedCombination;
    }

}
