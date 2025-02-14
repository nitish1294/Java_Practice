// check number is prime or not in range

import java.util.*;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("0 is neither prime nor composite number");

        } else if (n == 1) {
            System.out.println("1 is Not A Prime number");
        } else if (n == 2) {
            System.out.println("2 is a prime number");
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        System.out.println(i + " is not a prime number");
                        break;
                    } else {
                        System.out.println(i + " is a prime number");
                        break;
                    }
                }
            }

        }
        sc.close();
    }

}
