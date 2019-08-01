
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        
        int number;
        int sum = 0;
        int i = 0;
        double average = 0;
        int odd = 0;
        int even = 0;

        while (true) {
            System.out.println("Type numbers:");
            number = Integer.parseInt(reader.nextLine());
            if (number == -1) {

                break;

            } 
            if (number % 2 != 0) {
                odd++;
            } else if (number % 2 == 0) {
                even++;
            }
            

            sum = sum + number;
            i++;
            average = (double) sum / i;

        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " +sum);
        System.out.println("How many numbers:" + i);
        System.out.println("Average of numbers:" + average);
        System.out.println("Number of odd numbers:" + odd);
        System.out.println("Number of even numbers:" + even);
    }

}
