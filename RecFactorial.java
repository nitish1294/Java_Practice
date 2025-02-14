/*Calculate Factorial And Print Using Recursion
 * factorial=n*(n-1)
 * fon=factorial(n-1)
 * fact=factorial*fact(n-1)
 * 5!=5*4*3*2*1
 * Ansewar is =120
 * 
 */
public class RecFactorial {

    public static int Factorial(int n) {
        if (n == 0) {
            return 1;
        }
        // int Fact = n * Factorial(n - 1);//we can use this line and also use
        
        int Number = Factorial(n - 1);
        int Fact = n * Number;
        return Fact;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Factorial(n));
    }
}
