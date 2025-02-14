/* Question 3..
 * for a given set of string , Print the largest string 
 * "apple" "mango" " banana"
 * it return mango because it compare first latter
 */


public class CampareString {
    public static void main(String[] args) {
        String fruits[] = { "apple", "mango", "banana" };
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];

            }
        }
        System.out.println(largest);

    }

}
