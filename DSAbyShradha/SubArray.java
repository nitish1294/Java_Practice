/*
 * Given an integer array nums, find the
subarray
with the largest sum, and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.

Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

 
 */
public class SubArray {
    public static int SubArrays(int arr[]) {
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum = arr[k] + sum;

                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;

    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, -1, 7, 8 };
        System.out.println("Max Sum is :" + SubArrays(arr));
    }

}
