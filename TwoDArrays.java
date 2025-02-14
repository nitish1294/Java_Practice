/*  Create 2D Arrays and insert Values And Also Fatch All The Values
 */

import java.util.Scanner;

public class TwoDArrays {
    public static void TwoD(int arr[][]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        for (int k = 0; k < arr.length; k++) {
            for (int l = 0; l < arr[0].length; l++) {
                System.out.print(arr[k][l] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int arr[][] = new int[3][3];

        TwoD(arr);
    }

}