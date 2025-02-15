import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoHashMap {

    public static void main(String[] args) {
        // To create HashMap
        HashMap<Integer, String> map = new HashMap<>();
        // Map<Integer, String> map1 = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");

        System.out.print(map);// To Print all HashMap
        System.out.println(map.get(1));// to Print value
        System.out.println(map.containsKey(1));// it check key it present or not(True & False)
        System.out.println(map.containsValue("One"));// it check Value it present ornot(True & False)
        // KeySet is method to print all value
        for (int i : map.keySet()) {
            System.out.println("Key :" + i + " Value :" + map.get(i));
        }
       // map.remove(1);// to remove using key
        //map.remove(1, "One");//to   

      
        // To Print All Key
        System.out.println(map.keySet());
        map.put(1, "ONE");// used to also UPDATE VALUE
        for (int i : map.keySet()) {
            System.out.println("Key :"+i+" Value :"+ map.get(i));
            }
     
    }

}