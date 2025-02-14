
public class PowerOfTwo {

    public static boolean TwoPower(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        TwoPower(3);
        TwoPower(2);
        TwoPower(5);
    }
}
