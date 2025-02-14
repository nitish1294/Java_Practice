/*
 * Given an array arr[], the task is to reverse the array. Reversing an array means rearranging the elements such that the first element becomes the last, the second element becomes second last and so on.

Examples:

    Input: arr[] = {1, 4, 3, 2, 6, 5}  
    Output: {5, 6, 2, 3, 4, 1}
    Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.

    Input: arr[] = {4, 5, 1, 2} 
    Output: {2, 1, 5, 4}
    Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.

 */

public class ReverseArray {
    public static void Reverse(int arr[]) {
        int last = arr.length - 1;
        for (int i = 0; i < last; i++) {
            int temp = arr[i];
            arr[i] = arr[last];
            arr[last] = temp;
            last--;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 1, 2 };
        System.out.println("Original Arrays Is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);

        }
        System.err.println();
        Reverse(arr);
        System.out.println("Reversed Arrays Is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

    }

}
