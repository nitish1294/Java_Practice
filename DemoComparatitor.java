import java.util.*;

public class DemoComparatitor {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);

        list.add(2);
        list.add(5);
        list.sort(null);//it return ascending order
        list.sort((a,b)->b-a);//it return into descending order
        System.out.println(list);
    }

}
