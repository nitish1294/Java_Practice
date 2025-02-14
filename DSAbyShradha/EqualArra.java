public class EqualArra {
    // ************************************One
    // Ways************************************************************
    public static boolean equal(int arr[], int arr2[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr2[i]) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 1, 2, 3, 4, 5 };
        
    }

}
