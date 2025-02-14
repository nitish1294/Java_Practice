
/* Simple create Arrays
Datatype ArraysName=New Datatype[10];

*/
import java.util.*;

public class ArraysCreate {

    public static void main(String[] args) {
        // Create an array of integers
        int[] intArray = new int[10];
        Scanner sc = new Scanner(System.in);
        intArray[0] = sc.nextInt();
        intArray[1] = sc.nextInt();
        intArray[2] = sc.nextInt();
        intArray[3] = sc.nextInt();
        System.out.println("Maths: " + intArray[0]);
        System.out.println("phy: " + intArray[1]);
        System.out.println("science: " + intArray[2]);
        System.out.println("hindi: " + intArray[3]);
    }
}