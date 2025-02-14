/*
 * Given an array of size N. The task is to find the maximum and the minimum element of the array using the minimum number of comparisons.

Examples:

    Input: arr[] = {3, 5, 4, 1, 9}
    Output: Minimum element is: 1
            Maximum element is: 9

    Input: arr[] = {22, 14, 8, 17, 35, 3}
    Output:  Minimum element is: 3
             Maximum element is: 35
 */

import java.util.*;

public class ArraysMinMax {
    public static int minmax(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum Value is : " + min);
        return max;

    }

    public static void main(String[] args) {
        int arr[] = { -1, 3, 100, 5, 6 };
        System.out.println("Maximum Value is : " + minmax(arr));

    }
}