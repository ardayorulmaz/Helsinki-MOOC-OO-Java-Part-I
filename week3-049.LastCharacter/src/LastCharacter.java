import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String word = reader.nextLine();
        System.out.println("Last character is:"+lastCharacter(word));
    }
    public static char lastCharacter (String name) {
    char letter =name.charAt(name.length()-1);
    return letter;
    }
}
