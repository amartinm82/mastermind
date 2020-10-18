package usantatecla.mastermind;

import usantatecla.mastermind.views.graphics.View;

public class GraphicsMastermind extends Mastermind {

    @Override
    protected View createView() {
        return new View();
    }

    public static void main(String[] args) {
        new GraphicsMastermind().play();
    }

}
