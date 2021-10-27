import java.util.HashMap;
import java.util.Map;

public class MAP {
    public static void main(String[] args) {
        Map < Integer, String > studentInfo = new HashMap < > ();
        studentInfo.put(1, "Deeepak Singh");
        studentInfo.put(2, "pooja Singh");
        System.out.println(studentInfo);
        System.out.println(studentInfo.values());
        System.out.println(studentInfo.keySet());
        System.out.println(studentInfo.get(1));
    }

}