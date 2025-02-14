//  Calculater 
import java.util.*;
public class Calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        sc.close();
        int result = 0;
        switch (op) {
            case '+':
            result = num1 + num2;
            break;
            case '-':
            result = num1 - num2;
            break;
            case '*':
            result = num1 * num2;
            break;
            case '/':
            if (num2 != 0) {
                result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;
                    }
                    break;
                    default:
                    System.out.println("Error! Invalid operator.");
                    return;
                    }
                    System.out.println("Result: " + result);

            
    }
    
}
