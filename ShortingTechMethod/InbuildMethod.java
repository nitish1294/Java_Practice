import java.util.*;

/* */
public class InbuildMethod {

    public static void main(String[] args) {
        Integer arr[] = { 3, 2, 10, 4, 5 };
        // 1. For Short All Arrays Asending Order
        // Arrays.sort(arr);

        /*
         * 2.
         * For Short Specific Array
         * In This Method Start From index =1 means index=[0] value=1
         * And The Last Index Is Like If you Want Short to 4 means index[2] value=3
         * 
         * Arrays.sort(arr, 0, 4);
         */
        // 3. print It Into Desending Order Use Collectins Method
        // Arrays.sort(arr, Collections.reverseOrder());

        //4. Also If you Want to Sort Only 3,4 VAlue Then
        Arrays.sort(arr, 0, 4, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
