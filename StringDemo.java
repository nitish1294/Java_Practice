// String Concating And creating
import java.lang.*;

public class StringDemo {

    public static void main(String[] args) {
        // 2 Way to create String
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = "This is a test string";
        // String Concation
        String str4 = str1 + str2;
        // String Used To Print Length of string
        System.out.println(str3.length());
        System.out.println(str3);

        System.out.println(str1.charAt(0));

        if (str1.equals(str2)) {
            // It Check Object Type is return true if both Object value are Equal
            // str1==str2 This condition is check object that's why it return false
            System.out.println("Both Are Equal");
        } else {
            System.out.println("Both are Not Equal ");
        }

    }
}