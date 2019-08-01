
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        while (true) {
            System.out.println("name:");
            String studentName = reader.nextLine();
            if (studentName.isEmpty()) {
                break;
            } else {

                System.out.println("student number:");
                String number = reader.nextLine();
                Student student = new Student(studentName, number);
                list.add(student);
            }

        }

        for (Student st : list) {
            System.out.println(st);
        }

        System.out.println("Give the search term:");
        String term = reader.nextLine();
        System.out.println("Result:");
        for (Student st : list) {
            if (st.getName().contains(term)) {
                System.out.println(st);
            }

        }
       
    }
}
