package usantatecla.mastermind;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.views.console.View;

public class ConsoleMastermind extends Mastermind {

    @Override
    protected View createView(Logic logic) {
        return new View(logic);
    }

    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }

}
