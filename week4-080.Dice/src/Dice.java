
import java.util.Random;

public class Dice {

    private Random random = new Random();
    private int numberOfSides;
    private int diceType;
    private int roll;
    Random dice = new Random();

    public Dice(int numberOfSides) {
        this.diceType = numberOfSides;
        // Initialize here the number of sides
    }

    public int roll() {
        int result = dice.nextInt(diceType);
        return result+1;
        // create here a random number belongig to range 1-numberOfSided
    }
}
