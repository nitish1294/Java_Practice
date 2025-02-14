/*You have a given arrays you just need to find out is arrays is shorted or not using recrution
 * arr{1,2,3,4,5}
 * it return arrays is shorted
 * &
 * arr{1,2,4,3}
 * it return arrays is not Shorted
 */
public class RecSorted {

    public static boolean IsShorted(int arr[], int i) {
        if (i == arr.length - 1) {//this line is last 
            return true;
        }
        if (arr[i] > arr[i + 1]) {//it check if arr[0] >arr[1] it return false(not shorted)
            return false;
        }
        return IsShorted(arr, i + 1);//it simplly increase i++ and check until i==arr.length

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 5};
        System.out.println(IsShorted(arr, 0));
    }

}
