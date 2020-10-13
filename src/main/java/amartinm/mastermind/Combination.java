package amartinm.mastermind;

public abstract class Combination {

    protected static final int MAX_SIZE = 4;
    protected Colour[] colours = new Colour[MAX_SIZE];

    public Colour[] getColours() {
        return this.colours;
    }

    public Result getResult(Combination combination) {
        int blacks = 0;
        int whites = 0;
        for (int i = 0; i < combination.getColours().length; i++) {
            if (combination.getColours()[i] == this.colours[i]) {
                blacks++;
            } else {
                for (int j = 0; j < this.colours.length; j++) {
                    if (combination.getColours()[i] == this.colours[j])
                        whites++;
                }
            }
        }
        return new Result(combination.toString(), blacks, whites);
    }

    public abstract void generateCombination();

    @Override
    public boolean equals(Object otherCombination) {
        if (otherCombination instanceof Combination) {
            int i = 0;
            while (i < this.colours.length && this.colours[i] == ((Combination) otherCombination).colours[i])
                i++;
            return i == MAX_SIZE;
        }
        return false;
    }

    protected boolean isValidCombination() {
        for (Colour c : this.colours) {
            if (c == null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < colours.length; i++)
            sb.append(colours[i].getSymbol());
        return sb.toString();
    }
}
