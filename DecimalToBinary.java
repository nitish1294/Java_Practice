/*Convert Decimal Number to binary number
first
take number
apply loop in number
reminder=number/2
binary=binary+reminder*10*power
power++


 */

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int n = sc.nextInt();
        int binary = 0;
        int power = 0;
        while (n > 0) {
            int reminder = n % 2;
            binary = binary + reminder * (int) Math.pow(10, power);
            power++;
            n = n / 2; 
            }
            System.out.println("Binary number is: " + binary);
    }
    
}
