
import java.util.Scanner;

public class GradesAndPoints {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]");
        int point = Integer.parseInt(reader.nextLine());
        
        if (point  <30) {System.out.print("Grade: failed");
        }
        else if (  point <35 ) {System.out.print("Grade: 1");
        
        }
        else if (  point <40 ) {System.out.print("Grade: 2");
        
        }
        else if (  point <45 ) {System.out.print("Grade: 3");
        
        }
        else if (  point <50) {System.out.print("Grade: 4");
        
        }
        else if (  point <61 ) {System.out.print("Grade: 5");
        
        }
    }
}
