/*In Arrays Find The Largest Number From Array */

import java.util.*;

public class ArraysLargestNumber {

    static int GetSmallest(int array[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    static int GetLargest(int array[]) {
        int largest = 0;
        for (int i = 0; i < array.length; i++) {
            if (largest < array[i]) {
                largest = array[i];
            }
        }
        return largest;
    }

    /*
     * public static int GetLargestNumber(int array[]) {
     * int largest = 0;
     * int smallest = Integer.MAX_VALUE;
     * for (int i = 0; i < array.length; i++) {
     * if (largest < array[i]) {
     * largest = array[i];
     * }
     * if (smallest > array[i]) {
     * smallest = array[i];
     * }
     * 
     * }
     * System.out.println("Smollest Values Is : "+smallest);
     * return largest;
     * }
     */
    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };
        System.out.println("Smallest Value is: " + GetSmallest(array));
        System.out.println("Largest Value is: " + GetLargest(array));
        // System.out.println("Largest Number is :" + GetLargestNumber(array));
    }
}
