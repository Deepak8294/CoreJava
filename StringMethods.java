public class StringMethods {
  public static void main(String[] args) {
    String s = "raj";
    System.out.println(s.charAt(1)); //return the char value at the 1 index
    //custom input string 2
    s = s.concat("kumar");
    //print combined string
    System.out.println(s);
    //concept of == operator
    String s1 = "Hello";
    String s2 = "Hello";
    String s3 = new String("Hello");
    System.out.println(s1 == s2); //true
    System.out.println(s1 == s3); //false
    System.out.println(s1.equals(s2)); //true
    System.out.println(s1.equals(s3)); //true

  }
}
