package amartinm.mastermind.views;

import amartinm.mastermind.controllers.PlayController;
import amartinm.utils.Menu;

public class PlayMenu extends Menu {

    PlayMenu(PlayController playController) {
        this.add(new ProposalCommand(playController));
        this.add(new UndoCommand(playController));
        this.add(new RedoCommand(playController));
    }

}
