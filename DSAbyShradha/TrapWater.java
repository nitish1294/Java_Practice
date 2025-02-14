/*Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

 

Example 1:

Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9

step 1: calculate left max& right max
 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1
 
 */
public class TrapWater {
//********************************************Solution 1 Way ****************************************************** */
    public static int trap(int arr[]) {
        int LeftMax[] = new int[arr.length];
        int RightMax[] = new int[arr.length];
        LeftMax[0] = arr[0];
        RightMax[arr.length - 1] = arr[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            if (LeftMax[j] <= arr[i]) {
                LeftMax[i] = arr[i];
            } else if (LeftMax[j] > arr[i]) {

                LeftMax[i] = LeftMax[j];
            }
        }
        for (int j = arr.length - 2; j >= 0; j--) {
            int k = j + 1;
            if (RightMax[k] <= arr[j]) {
                RightMax[j] = arr[j];
            } else if (RightMax[k] > arr[j]) {
                RightMax[j] = RightMax[k];
            }

        }
        int total = 0;
        for (int n = 0; n < arr.length; n++) {
            int left = LeftMax[n];
            int right = RightMax[n];
            int min = Math.min(left, right);
            int sum = min - arr[n];
            total = sum + total;
        }
        return total;

    }
//********************************************Solution 2 Way ****************************************************** */

    public static int TrapWater(int arr[]) {
        int length = arr.length;
        int LeftMax[] = new int[length];
        LeftMax[0] = arr[0];
        for (int i = 1; i < length; i++) {
            LeftMax[i] = Math.max(arr[i], LeftMax[i - 1]);
        }
        int RightMax[] = new int[length];
        RightMax[length - 1] = arr[length - 1];
        for (int n = length - 2; n >= 0; n--) {
            RightMax[n] = Math.max(arr[n], RightMax[n + 1]);
        }
        int total = 0;
        for (int i = 0; i < length; i++) {
            int Waterlevel = Math.min(LeftMax[i], RightMax[i]);
            total += Waterlevel - arr[i];

        }
        return total;

    }

    public static void main(String[] args) {
        int[] arr = { 1,8,6,2,5,4,8,3,7 };
        // System.out.println(trap(arr));
        System.out.println(TrapWater(arr));
        }
}
