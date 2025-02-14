/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true
 */
/*******************************************Solution**********************************************************/

public class duplicate {
    static boolean Array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[start] == arr[j]) {
                    return true;
                }

            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4,5 };
        boolean b =Array(arr);
        if(b==true){
            System.out.println("Duplicate found");
        }
        else{
            System.out.println("No duplicate found");
        }
    }
}
