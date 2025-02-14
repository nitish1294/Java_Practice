// Check The Student is Pass Or Fail

import java.util.*;

public class CheckPassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of student");
        int marks = sc.nextInt();
        if (marks >= 35) {
            System.out.println("Student is Pass");
        } else {
            System.out.println("Student is Fail");
        }

    }

}
