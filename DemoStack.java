import java.util.Stack;

public class DemoStack {
    public static void main(String[] args) {
        Stack<Integer> sx = new Stack<>();
        //Push Is Similar as Add it add value in stack
        sx.push(1);
        sx.push(2);
        sx.push(3);
        sx.push(4);
        sx.push(5);
        System.out.println(sx);
        //it pop method used to remove element from last index
        sx.pop();
        System.out.println(sx);
        //it also have to remove element from index base
        sx.remove(2);
        System.out.println(sx);

        

    }
}
