/*  Calculate The Binomial coefficient 
Binomial coefficient=(n!)/(k!( n-k)!)
step to solve
1. Calculate the factorial of n
2. Calculate the factorial of k
3. Calculate the factorial of (n-k)
4. Multiple the k factorial * (n-k)
5. int binomialCoefficient = a / e;
6. show the answer
*/

import java.util.*;

public class BinomialCoefficient {

    int fact(int fac) {
        int factorial = 1;
        for (int i = 1; i <= fac; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        BinomialCoefficient bc = new BinomialCoefficient();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        int d = n - k;
        int a = bc.fact(n);
        int b = bc.fact(k);
        int c = bc.fact(d);
        int e = b * c;
        int binomialCoefficient = a / e;

        System.out.println("The binomial coefficient is " + binomialCoefficient);

    }
}
