package amartinm.mastermind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserCombination extends Combination {

    public void generateCombination() {
        this.colours = new Colour[this.MAX_SIZE];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.print("Propose a combination: ");
            String userCombination = null;
            try {
                userCombination = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (userCombination.length() != this.MAX_SIZE) {
                System.out.println("Wrong proposed combination length");
            } else {
                int i = 0;
                Colour colour = Colour.BLUE;
                while (i < MAX_SIZE && colour != null) {
                    colour = Colour.valueOf(userCombination.charAt(i));
                    if (colour != null) {
                        this.colours[i] = Colour.valueOf(userCombination.charAt(i));
                    }
                    i++;
                }
            }
        } while (!this.isValidCombination());
    }

}
