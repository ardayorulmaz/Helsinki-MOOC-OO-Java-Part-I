
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String name = reader.nextLine();
        int i = 0;

        while (i < name.length()) {
            char letter = name.charAt(i);
            System.out.println((i + 1) + ". character: " + letter);
            i++;
        }
    }
}
