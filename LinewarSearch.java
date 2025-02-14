/* Linear Search Means You Have 1 Arrays It Containt Values 
   You have one key/number That is from arrays 
   You have to find that key/number in arrays
   like arrays={1,2,3,4,5}
   key/number=3
   Output: 3 is found in arrays
 */

import java.util.*;

public class LinewarSearch {

    int LinewarSearch(int arrays[], int key) {
        for (int i = 0; i <= arrays.length; i++) {
            if (arrays[i] == key) {
                return i;

            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arrays[] = { 10, 12, 14, 16, 18 };
        int key = 12;
        LinewarSearch ls = new LinewarSearch();
        int result = ls.LinewarSearch(arrays, key);
        if (result == -1) {
            System.out.println(key + " is not found in arrays");
        } else {
            System.out.println(key + " is found in arrays At: "+result);
        }

    }
}
