
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);

    }

    public static int smallest(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
        // write the code here
    }

    public static int indexOfTheSmallest(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;

            }

            // code goes here
        }
        return index;

    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int indeks) {
        int index = indeks;
        for (int i = indeks; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;

            }

            // code goes here
        }
        return index;

        // write the code here
    }

    public static void swap(int[] array, int index1, int index2) {
        int first = array[index1];
        int second = array[index2];
        array[index2] = first;
        array[index1] = second;

        // code goes here
    }

    public static void sort(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            System.out.println( Arrays.toString(array) );
            swap(array, indexOfTheSmallestStartingFrom(array, i), i);
            
        }
        

    }
}
