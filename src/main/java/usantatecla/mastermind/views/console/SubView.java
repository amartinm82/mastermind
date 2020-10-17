package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.Logic;

public class SubView {

    protected Logic logic;

    SubView(Logic logic) {
        assert logic != null;

        this.logic = logic;
    }

}
