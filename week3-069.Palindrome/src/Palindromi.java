
import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        if (text.equals(reverse(text))) {
            return true;
        }

        // write code here
        return false;
    }

    public static String reverse(String text) {

        int textLength = text.length();
        int i = 0;
        String reverse = "";

        while (textLength > i) {
            char character = text.charAt(textLength - 1 - i);

            reverse = reverse + character;
            i++;
            // write your code here
            // note that method does now print anything, it RETURNS the reversed string

        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
