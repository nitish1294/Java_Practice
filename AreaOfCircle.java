// Find The Area Of Circle

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Find The Area Of Circle");
        System.out.println("Enter the radius of the Circle");
        double r=sc.nextDouble();
        float pi=3.14f;
        double area = pi * r * r;
        System.out.println("The Area of Circle is "+area);
    }
}
