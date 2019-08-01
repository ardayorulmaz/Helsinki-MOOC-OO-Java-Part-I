
import java.util.ArrayList;
import java.util.Scanner;

public class Words {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.println("Type a word:");
            String input = reader.nextLine();
            words.add(input);
            if (input.isEmpty()) {
                System.out.println("You typed the following words:");
                for (String entry : words) {
                    System.out.println(entry);}
                    break;
                }
                
            }
            // could also be: word.equals("")
            // word was empty, meaning that the user only pressed enter

        }
    }

