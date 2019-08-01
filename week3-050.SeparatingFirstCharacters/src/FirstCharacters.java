import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String name =reader.nextLine();
        if (name.length()>2){
        char first = name.charAt(0);
        char second = name.charAt(1);
        char third = name.charAt(2);
System.out.println("1.character: "+first);
System.out.println("2.character: "+second);
System.out.println("3.character: "+third);}
        
    }
}
