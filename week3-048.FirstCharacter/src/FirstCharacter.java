import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String word = reader.nextLine();
        System.out.println("First character is:"+firstCharacter(word));
    }
    public static char firstCharacter (String word) {
    char character = word.charAt(0);
    
    return character;
    }
}
