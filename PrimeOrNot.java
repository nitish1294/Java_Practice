// Find If number Is Prime OR Not Prime

import java.util.*;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            if  (n % i == 0) {
                System.out.println(n + " is not a prime number");
                break;
            }
            {
                System.out.println(n + " is a prime number");
                break;
            }
        }
        sc.close();

    }

}
