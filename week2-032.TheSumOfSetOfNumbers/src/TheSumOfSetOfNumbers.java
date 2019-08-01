
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("To which number?");
        int finalnumber = Integer.parseInt(reader.nextLine());
        int i = 1;
        int sum=0;
        
        
        
        while (i<=finalnumber) {
        sum=sum+i;
                i++;}
        
        
System.out.println(sum);
    }
       
}
