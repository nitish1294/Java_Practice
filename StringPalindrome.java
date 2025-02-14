/*Check If The String is Palindrome Or Not
 * When The String is word are Same when we Reverse and read from start
 * like NooN, NitiN , RacecaR........Is Palindrom String
 */

public class StringPalindrome {
    public static boolean Palindrome(String str) {
        int n = str.length() - 1;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i)) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        String str = "nitin";
        boolean m = Palindrome(str);
        if (m == true) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }

    }
}