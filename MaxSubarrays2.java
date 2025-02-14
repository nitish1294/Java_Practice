/*Kadane's Algorithme using this solve maxsubarray 
 * it check if the maxvalue is nagative it store 0 and if maxvalue is > nagative value then it substract 
 * 
 */
import java.util.*;

public class MaxSubarrays2 {
    public static int maxsubarray(int arr[]) {
        int max = Integer.MIN_VALUE;
        int current = 0;
        for (int i = 0; i < arr.length; i++) {
            current = current + arr[i];
            if (current < 0) {
                current = 0;
            }
            max = Math.max(current, max);
        }
        return max;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -6, 4, 5, 6 };
        System.out.println(maxsubarray(arr));

    }

}
