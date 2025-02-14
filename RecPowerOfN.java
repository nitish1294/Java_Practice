/* write a program to find the power of n
 * like x^n x=2 and n=10
 * power of x=2*2*2*2*2*2*2*2*2*2;
 * power of x=
 */
public class RecPowerOfN {

    public static int Power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // int xopn = Power(x, n - 1);
        int power = x * Power(x, n - 1);//we can also used

        return power;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(Power(x, n));
    }

}
