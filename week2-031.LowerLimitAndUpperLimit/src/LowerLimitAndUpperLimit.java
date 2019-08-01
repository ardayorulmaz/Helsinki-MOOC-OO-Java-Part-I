
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("From which number?");
        int first =Integer.parseInt(reader.nextLine());
        
        System.out.println("To which number?");
        int last =Integer.parseInt(reader.nextLine());
        while (first<=last) { System.out.println(first);
        first++;
        }

        // write your code here

    }
}
