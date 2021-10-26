  //abstract class
abstract class Car {
    abstract void accelerate();
}
//concrete class
class BMW extends Car {
    void accelerate() {
        System.out.println("BMW::accelerate");

    }
}
public class Abstract {
    public static void main(String args[]) {
        Car obj = new BMW();
        obj.accelerate(); //call the method  
    }
}
