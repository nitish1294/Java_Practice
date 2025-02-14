// it simple just take smoller number and paste in start 
public class SelectionSort {

    public static void Selection(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i ; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 5, 7};
        Selection(arr);
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);

        }
    }
}
