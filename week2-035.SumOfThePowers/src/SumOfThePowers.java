
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
System.out.println("Type a number:");
int number = Integer.parseInt(reader.nextLine());
int sum = 0;
int i= 0;

while (i<=number) {
sum=sum+(int)Math.pow((2), i);
i++;
}
System.out.println("Sum is: "+sum);

    }
}
