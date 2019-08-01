
import java.util.Arrays;

public class Main {

    public static int[] copy(int[] array) {
        int[] newarray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newarray[i] = array[i];
        }
        return newarray;
    }

    public static int[] reverseCopy(int[] array) {
    int[] newarray = new int[array.length];
   for (int i = 0; i < array.length; i++) {
            newarray[(array.length-i-1)] = array[i];
        }
        return newarray;}

    public static void main(String[] args) {
      
    int[] original = {1, 2, 3, 4};
    int[] reverse = reverseCopy(original);

    // print both
    System.out.println( "original: " +Arrays.toString(original));
    System.out.println( "reversed: " +Arrays.toString(reverse));
}

}
