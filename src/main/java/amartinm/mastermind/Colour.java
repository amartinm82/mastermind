package amartinm.mastermind;

import java.util.Random;

public enum Colour {
    RED('r'),
    BLUE('b'),
    YELLOW('y'),
    GREEN('g'),
    ORANGE('o'),
    PURPLE('p');

    private char symbol;

    Colour(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return this.symbol;
    }

    public static Colour getRandomColour() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    public static Colour valueOf(char colour) throws IllegalArgumentException {
        for (Colour c : values()) {
            if (c.symbol == colour) {
                return c;
            }
        }
        System.out.print("Wrong colors, they must be: ");
        for (Colour c : values()) {
            System.out.print(c.symbol);
        }
        System.out.println();
        return null;
    }
}
