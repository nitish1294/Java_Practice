
public class RecSumNatural {

    public static int Natural(int n) {
        if (n == 1) {
            return 1;
        }
        int number = Natural(n - 1);
        // int sum = n + Natural(n - 1); //We can also use this whithout Up and down line
        int sum = number + n;
        return sum;

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Natural(n));
    }
}
