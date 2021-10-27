import java.util.LinkedHashSet;

public class Set {
    public static void main(String[] args) {
        LinkedHashSet < Integer > singh = new LinkedHashSet < Integer > ();
        // it contains unique value
        singh.add(2000);
        singh.add(1000);
        singh.add(999);
        singh.add(99);
        singh.add(49);
        singh.add(29); // it is duplicate value
        System.out.println(singh);
    }

}