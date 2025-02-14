/* Calculate and Print Fibonacci Number Using Given number
 * simple
 * fibonacci1 =fibo(n-1);
 * fibonacci2 =fibo(n-2);
 * fibonacci of n =fibonacci1 + Fibonacci2;
 */
public class RecFibonacci {

    public static int Fibo(int n) {
        if (n == 1 | n == 0) {
            return n;
        }
        int fibo1 = Fibo(n - 1);
        int fibo2 = Fibo(n - 2);
        int Fibo = fibo1 + fibo2;

        return Fibo;
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(Fibo(n));
    }
}
