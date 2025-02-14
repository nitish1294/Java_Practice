import java.util.Vector;

public class DemoVector {
    public static void main(String[] args) {
        Vector<Integer> vx=new Vector<>();
        vx.add(1);
        vx.add(2);
        vx.add(0, 0);
        vx.add(3);
        
        vx.set(3, 0);
        //To Print Vector and Its Capacity
        System.out.println(vx+" "+vx.capacity());
        //it check if the value avalable or not
        System.out.println(vx.contains(1));
        //PRint First Number From Vector
        System.out.println(vx.firstElement());
        //Print Last Number From Index
        System.out.println(vx.lastElement());
//  ***************************   same Method like arrayList and It just PRovide Thread Safe**************************



    }
}
