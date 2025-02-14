/* Find The Factorial Of any number
like this
6 is 6!=6*5*4*3*2*1=720
  

 */

import java.util.*;

public class Factorial {

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n=sc.nextInt();
    int fact=1;
    for(int i=1;i<=n;i++){
        fact=fact*i;
        }
        System.out.println("The Factorial Of "+n+" Is = "+fact);
    }
}