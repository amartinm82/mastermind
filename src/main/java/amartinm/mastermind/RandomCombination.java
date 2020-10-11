package amartinm.mastermind;

public class RandomCombination extends Combination {

    public void generateCombination() {
        for (int i = 0; i < this.MAX_SIZE; i++) {
            this.colours[i] = Colour.getRandomColour();
        }
    }
}
