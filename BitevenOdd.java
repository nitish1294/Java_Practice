
public class BitevenOdd {

    public static void EvenOdd(int n) {
        int bit = 1;
        if ((n & bit) == 0) {
            System.out.println(n + " IS Even Number.");
        } else {
            System.out.println(n + " Is Odd Number.");
        }
    }

    public static void main(String[] args) {
        EvenOdd(5);
        EvenOdd(10);
        EvenOdd(99);
    }
}
