
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        
        int textLength = text.length();
        int i = 0;
        String reverse= "";
        
        while (textLength>i) {
         char character = text.charAt(textLength-1-i);
         
         reverse= reverse + character;
         i++;
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        
    }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
