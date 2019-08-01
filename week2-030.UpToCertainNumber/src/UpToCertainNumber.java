
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int number = 1;
        
        System.out.println("Up to which number:");
        int limit = Integer.parseInt(reader.nextLine());
        
        while (number <= limit) {
            System.out.println(number);
            number++;
        }
        
        // Write your code here
        
    }
}
