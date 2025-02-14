//Constructor Demo

public class Constructor {

    public Constructor() {
        System.out.println("Whithout Parametar");
    }

    public Constructor(int i) {
        System.out.println("enter value is " + i);
    }

    public Constructor(String str) {
        System.out.println("The String is:" + str);
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor(5);
        Constructor obj1 = new Constructor();
        Constructor obj2 = new Constructor("Nitish");

    }
}
