
import java.util.ArrayList;

;

public class TheGreatest {

    public static int greatest(ArrayList<Integer> list) {
        int biggest = list.get(0);
        for (int number : list) {
            if (number > biggest) {
               biggest= number;
            }

            // write code here
           
        }
         return biggest;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);

        System.out.println("The greatest number is: " + greatest(lista));
    }
}
