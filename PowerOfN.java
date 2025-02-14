
public class PowerOfN {

    public static int Power(int x, int n) {
        int power = x;//use i power here
        for (int i = 1; i < n; i++) {//run loop 9 time and update power value 
            power = power * x;
        }
        //And Return power
        return power;
    }

    public static void main(String[] args) {
        int n = 10;
        int x = 2;
        System.out.println(Power(x, n));
    }
}
