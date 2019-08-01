
import java.util.Random;

public class PasswordRandomizer {

    // Define the variables
    private int length;
    private Random random = new Random();
    private int i;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        //this.random.nextInt(length);
    }

    public String createPassword() {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        // write code that returns a randomized password
        int i =0;

        String password = "";
        while (i < this.length) {

            char symbol = characters.charAt(random.nextInt(characters.length()));
            password += symbol;
            i++;

        }

        return password;
    }
}
