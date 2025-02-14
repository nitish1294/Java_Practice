
/* Print SubArrays In java 
 * like [2,4,6,8,10]
 * subarrays is 
 * [2] [2,4] [2,4,6] [2,4,6,8] [2,4,6,8,10]
 * [4] [4,6] [4,6,8] [4,6,8,10]
 * [6] [6,8] [6,8,10]
 * [8] [8,10]
 * [10]
 * 
 * 
 * 
*/

import java.util.*;

public class SubArrays {
    public static void SubArrays(int arr[]) {
        int Total=0;
        for (int i = 0; i < arr.length; i++) {
            for (int k = i; k < arr.length; k++) {
                System.out.print("[");
                for (int j = i; j <= k; j++) {
                    System.out.print(arr[j]);
                }
                Total++;
                System.out.print("]");

            }
            System.out.println();

        }
        System.out.println("Total SubArrays are "+Total);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        SubArrays(arr);
    }

}
