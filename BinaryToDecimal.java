
/*take binary number and convert into decimal number
>>>>>
decimal=0
decimal=decimal+lastnumber*2*power
*/
import java.util.*;

public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary Number: ");
        int binary = sc.nextInt();
        int decimal = 0;
        int power = 0;
        while (binary > 0) {
            int lastnumber = binary % 10;
            decimal = decimal + lastnumber * (int) Math.pow(2, power);
            binary = binary / 10;
            power++;
        }
        System.out.println("Decimal Number is: " + decimal);
    }

}
