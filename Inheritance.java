
class Animal{
     void Eat(){
        System.out.println("Animal Are Eat.");
    }
    void Sleep(){
        System.out.println("Animal Are Sleep.");
    }
    void Walk(){
        System.out.println("Animal Are also Walk");
    }
}
class jaguar extends Animal{
    void Hunt(){
        System.out.println("Animal Are Hunting The Food");
        
    }
}
public class Inheritance{
    public static void main(String []args){
        jaguar obj=new jaguar();
        obj.Hunt();
        obj.Eat();
        obj.Sleep();
        obj.Walk();
        System.out.println("The End.....");
    }
}
