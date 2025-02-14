
/*
Print Reverse Star

    *
   **
  ***
 ****
 */
import java.util.*;

public class StarPattern2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
