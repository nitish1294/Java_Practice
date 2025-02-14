
/*  Binary Search work like
it start value is 0 and end value is lenth of array
1 it divide array into two Parts And check Key is Equeal to Mid 
if it equeal it return index
otherwise is it check is is bigger then mid 
if it is then it it update start value
else it update end value
*/
import java.util.*;

public class BinarySearch {
    public static int Search(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Key");
        int key = sc.nextInt();
        System.out.println("The Index Of Key Is: "+Search(arr, key));

    }

}
