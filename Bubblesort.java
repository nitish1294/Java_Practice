// It Simple Just Find Min Value 

public class Bubblesort {

    public static void Bubble(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (min > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;


                }
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 5, 7};
        Bubble(arr);
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);

        }
    }
}
