/* write a program to check the number is occure in array or not if occure then return index
 * like arr{1,2,3,4,5,6} & key is=5
 * check the arr and print= index 4
 */
public class RecFirstOccur {

    public static int FirstOccure(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return FirstOccure(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 23, 6};
        int key = 23;
        System.out.println(FirstOccure(arr, key, 0));

    }

}
