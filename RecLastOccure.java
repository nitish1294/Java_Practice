/* Write a program to find the last Occurence of an element in an arrays using Recursion
 * like key =3 and array{1,2,3,4,3}
 * output is = 4
 */
public class RecLastOccure {

    public static int LastOccure(int arr[], int key, int i) {
        if (i == 0) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return LastOccure(arr, key, i-1);
    }

    public static void main(String[] args) {
        int arr[] = {5, 2, 2, 2, 5};
        int key = 2;
        int i = arr.length - 1;
        System.out.println(LastOccure(arr, key, i));

    }

}
