public class SubString {
    public static void Sub(String str, int start, int end) {
        while (start <= end) {
            System.out.print(str.charAt(start));
            start++;

        }
    }

    public static void main(String[] args) {
        String str = "Hello World";
        int start = 0;
        int end = 3;
        Sub(str, start, end);

    }

}
