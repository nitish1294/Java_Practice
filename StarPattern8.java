/*Print Pattern like This
 *     1
 *    12
 *   123
 *  1234
 * 12345
 */

import java.util.*;

public class StarPattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = n-i; j>=0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

}
