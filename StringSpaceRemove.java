public class StringSpaceRemove {
    public static void string(String str3) {
        for (int i = 0; i < str3.length(); i++) {
            char m = str3.charAt(i);
            if (m == ' ') {
                continue;

            } else {
                System.out.print(m);
            }

        }
    }

    public static void main(String[] args) {
        String str3 = "This is a test string";
        string(str3);
        
    }
}
