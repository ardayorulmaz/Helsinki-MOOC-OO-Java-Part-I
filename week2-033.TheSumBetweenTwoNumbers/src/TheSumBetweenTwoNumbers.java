
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
       System.out.println("What is the first number?");
       int first = Integer.parseInt(reader.nextLine());
       System.out.println("What is the last number?");
       int last = Integer.parseInt(reader.nextLine());
       int sum = 0;
       
       while (first<=last)
           
       {sum=sum+ first;
       first++;
       }
       System.out.println("Sum is:" + sum);
    }
}
