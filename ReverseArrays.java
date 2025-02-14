import java.util.*;

public class ReverseArrays {

    public static void Reverse(int arr[]) {
        int start = 0, end = arr.length - 1;
        /*
         * Using While Loop ......................................................
         * while (start < end) {
         * int temp = arr[start];
         * arr[start] = arr[end];
         * arr[end] = temp;
         * start++;
         * end--;
         * }
         */

        // Using For Loop ......................................................
        for (int i = start; i < end; i++) {
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
            end--;

        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        Reverse(arr);
        System.out.println("Reversed array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

    }
}
