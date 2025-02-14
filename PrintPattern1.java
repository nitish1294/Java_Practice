/*
 * 1
 * 23
 * 456
 * 78910
 * 1112131415
 * 
 */

import java.util.*;

public class PrintPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int n = sc.nextInt();
        int m = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(m++ + " ");
            }
            System.out.println();
        }

    }
}
