/* Write a program to find the last Occurence of an element in an arrays 
 * like key =3 and array{1,2,3,4,3}
 * output is = 4
 * 
 */
public class LastOccure {

    public static int LastOccur(int arr[], int key) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};
        int key = 3;
        System.out.println(LastOccur(arr, key));
    }

}
