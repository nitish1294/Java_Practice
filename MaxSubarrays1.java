
/* MaxSubArrays Using  (Prifix Sum) Method */
import java.util.*;

public class MaxSubarrays1 {
    public static int subarrays(int arr[]) {
        int maxvalue = 0;
        int current = Integer.MIN_VALUE;

        int prifix[] = new int[arr.length];
        prifix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prifix[i] = prifix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;

                current=start==0?prifix[end]:prifix[end]-prifix[start-1];

            /*   current = 0;
                for (int k = start; k <= end; k++) {
                    current = arr[k] + current;

                } */
                if (current > maxvalue) {
                    maxvalue = current;
                }

            }
        }

        return maxvalue;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, -6, 4, 5, 6 };
        System.out.println(subarrays(arr));
    }
}
