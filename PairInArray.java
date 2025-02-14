
/* Pair In Arrays like
like this array you need to find the posible arrays
 * [ 4 , 5 , 6 , 7 ]
 * (4,5) (4,6) (4,7) 
 * (5,6) (5,7)
 * (6,7)
 */
import java.util.*;

public class PairInArray {

    public static void PairArrays(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int first = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("(" + first + "," + arr[j] + ")");
            }
        }
        System.out.println();

        /*
         * ............................................Another Ways to solve
         * int start = 0;
         * for (int i = arr.length - 1; i >= 0; i--) {
         * for (int j = start + 1; j < arr.length; j++) {
         * System.out.println("(" + arr[start] + " " + arr[j] + ")");
         * 
         * }
         * ++start;
         * 
         * }
         * 
         * System.out.println();
         */
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        System.out.println("Original Arrays is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        PairArrays(arr);

    }

}
