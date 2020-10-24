package amartinm.mastermind.views.console;

import amartinm.mastermind.models.Color;
import amartinm.utils.Console;

class ColorView {

    private static final char[] INITIALS = {'r', 'b', 'y', 'g', 'o', 'p'};

    private final Color color;

    ColorView(Color color) {
        this.color = color;
    }

    static String allInitials() {
        StringBuilder result = new StringBuilder();
        for (char character : ColorView.INITIALS) {
            result.append(character);
        }
        return result.toString();
    }

    static Color getInstance(char character) {
        for (int i = 0; i < ColorView.INITIALS.length; i++) {
            if (ColorView.INITIALS[i] == character) {
                return Color.values()[i];
            }
        }
        return null;
    }

    void write() {
        Console.instance().write(ColorView.INITIALS[this.color.ordinal()]);
    }

}
