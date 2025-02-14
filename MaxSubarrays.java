
/* you have one arrays like[1,2,3,4,5] Brute Force Method
 * you need to print sub arrays and find wich subarrays max value
 */
import java.util.*;

public class MaxSubarrays {
    public static int subarrays(int arr[]) {
        int maxvalue = 0;
        int current = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                current = 0;
                for (int k = start; k <= end; k++) {
                    current = arr[k] + current;

                }
                if (current > maxvalue) {
                    maxvalue = current;
                }

            }
        }

        return maxvalue;
    }

    public static void main(String[] args) {
        int arr[] = {  5, 4, -1, 7, 8 };
        System.out.println(subarrays(arr));
    }

}
