// simple Calculate Interest

import java.util.*;


public class CalculateSimpleInterest {
    public static void main(String[] args) {
        

        Scanner sc =new Scanner(System.in);

        System.out.println("Calculate Simple Interest :");

        System.out.println("Enter Your Principle Amount: ");
        int Amount=sc.nextInt();
        System.out.println("Enter Your Rate of Interest: ");
        int Rate=sc.nextInt();
        System.out.println("Enter Your Year Period: ");
        int Year=sc.nextInt();  
        int Interest=Amount*Rate*Year/100;
        System.out.println("Your Simple Interest is: "+Interest);




    }
    
}
