
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.println("Type a number");
        int numberone = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number");
        int numbertwo = Integer.parseInt(reader.nextLine());
        int result = Math.max(numberone, numbertwo);
        System.out.println("The bigger number of the two numbers given was:" + result);
    }
}
