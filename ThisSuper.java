class Golu {
    String number = "abc";

    void display() {
        // use of this keyword
        System.out.println("value of this " + this.number);

    }
}

/* sub class childClass extending parentClass */
class Mohit extends Golu {
    String number = "def";

    void show() {
        // printing the number without use of super keyword
        System.out.println("Value of Num in child class without use of super keyword: " + number);

        // printing the number with use of super keyword
        System.out.println("Value of Num in parent class with use of super keyword: " + super.number);
        // printing the number with the use of this keyword
        System.out.println(" use of this keywod:" + this.number);
    }
}

public class ThisSuper {
    public static void main(String[] args) {

        Golu b = new Golu();
        b.display();
        Mohit a = new Mohit();

        a.show();
    }
}