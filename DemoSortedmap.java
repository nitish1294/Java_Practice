import java.util.SortedMap;
import java.util.TreeMap;

public class DemoSortedmap {
    public static void main(String[] args) {
        // Create Sortedmap
        SortedMap<Integer, String> map1 = new TreeMap<>((a, b) -> b - a);// It Short To Decsending Order
        SortedMap<Integer, String> map = new TreeMap<>();// It Short To Ascending Order

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
         map.put(4, "Four");
        map.put(5, "Five");
        System.out.println(map.firstKey());// Print First Key
        System.out.println(map.lastKey());// it print last Key
        System.out.println(map.headMap(3));// it Print key from Zero to 2
        System.out.println(map.tailMap(3));// it print 3 to End
        System.out.println(map.subMap(1, 4));// it print range 1 to 3
        System.out.println(map);//it Print as Its Behavier

    }
}
