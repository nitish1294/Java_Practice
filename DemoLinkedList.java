
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(4);

        
        // // it simply check condition and return outPut
        // list.removeIf(a -> a % 2 == 0);//it check if value is divided by 2 and return 0 it remove it

        // // To Get Last Or Get First
        // System.out.println(list.getFirst());
        // System.out.println(list.getLast());

        // // First add
        // list.addFirst(0);
        // list.addFirst(5);
        // // Add Last
        // list.addLast(6);
        // list.addLast(7);

        // To Print Ascending Order
        // list.sort(null);
        // list.sort((a,b)->a-b);

        // To Print Descending Order
        // list.sort((a,b)->b-a);

        // //remove Element from index
        // list.remove(3);

        // //Get Value value via index
        // System.out.println(list.get(3));

        // //Print All
        System.out.println(list);

    }
}
