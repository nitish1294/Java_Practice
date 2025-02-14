
public class InsertionSort {

    public static void Insertion(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;//current-1
            while (prev >= 0 && arr[prev] > curr) {//it run untile prev =0 or curr<arr[prev]
                arr[prev + 1] = arr[prev];//it it swap like 4,3,2,1
                prev--;//it reduce current value until it 0
            }
            arr[prev + 1] = curr;//insert this 
        }

    }

    public static void main(String[] args) {
        int arr[] = {5, 2, 6, 3, 9};
        Insertion(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
