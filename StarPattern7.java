/* Print like This Pattern
* * * * * * * * * *
*                 *
*                 *
*                 *
* * * * * * * * * *
 * 
 * 
 */


import java.util.*;

public class StarPattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total Row: ");
        int n = sc.nextInt();
        System.out.print("Enter Total Collums: ");
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // print if i=1 or i=row || print were j=1 or j=column
                if (i == 1 || i == n || j == 1 || j == m) {
                    // condition true then it print 
                    System.out.print("* ");
                    // other wise it print space
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }

    }
}