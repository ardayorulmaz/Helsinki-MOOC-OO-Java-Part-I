
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int cells = 0;
        int accepted = 0;
        int allScores = 0;
        ArrayList<String> grades = new ArrayList<String>();
        System.out.println("Type exam scores, -1 completes:");
        while (true) {

            int input = Integer.parseInt(lukija.nextLine());
            if (input == -1) {
                break;
            } else if (input < 61 && input > (-1)) {

                grades.add(giveGrade(input));
                allScores++;
            }

        }
        accepted = allScores;

        System.out.println("Grade distribution:");

        for (int i = 5; i > -1; i--) {
            System.out.print(i + ":");
            for (String grade : grades) {
                String y = Integer.toString(i);
                if (grade.contains(y)) {
                    System.out.print("*");
                }

            }
            System.out.println("");
        }
        for (String grade : grades) {
            if (grade.contains("0")) {
                accepted--;

            }
        }
        System.out.println("Acceptance percentage:" + (100 * (double) accepted / (double) allScores));

    }

// implement your program here
// do not put all to one method/class but rather design a proper structure to your program
// Your program should use only one Scanner object, i.e., it is allowed to call 
// new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    public static String giveGrade(int point) {
        if (point < 30) {
            return "0";

        } else if (point < 35) {
            return "1";

        } else if (point < 40) {
            return "2";

        } else if (point < 45) {
            return "3";

        } else if (point < 50) {
            return "4";

        } else if (point < 61) {
            return "5";

        }
        return null;

    }

}
