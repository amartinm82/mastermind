package amartinm.mastermind.models;

import java.util.List;

public class ProposedCombination extends Combination {

    boolean contains(Color color, int position) {
        return this.colors.get(position) == color;
    }

    boolean contains(Color color) {
        for (Color currentColor : this.colors) {
            if (currentColor == color) {
                return true;
            }
        }
        return false;
    }

    public List<Color> getColors() {
        return this.colors;
    }

}
