
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here
        System.out.println("Type a number:");
        int value = Integer.parseInt(reader.nextLine());

        if ((value / 2 % 2) == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd.");
        }

        // NOTE:
        // Parity of a value can be easily checked with modulo-operator %.
        // Test the following:
        // System.out.println( 1%2 );
        // System.out.println( 2%2 );
        // System.out.println( 3%2 );
        // System.out.println( 4%2 );
        // System.out.println( 5%2 );
        // System.out.println( 6%2 );
        // System.out.println( 7%2 );
        //int value = 9;
        //System.out.println( value%2 );
    }
}
