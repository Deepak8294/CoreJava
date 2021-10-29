public class Main{
    public static void main(String[] args) {
        //declare two objects of Person class
        Person p1 = new Person("Mohit", 22);
        Person p2 = new Person("Bikash", 26);
        int ageDiff = p1.compareTo(p2);     //compare ages of two persons declared
        switch(ageDiff) {
            case -1: {
                System.out.println(p2.getName() + " is older than " + p1.getName());
                break;
            }
           case 1: {
                System.out.println(p1.getName() + " is older than " + p2.getName());
                break;
                }
             default:
                System.out.println(p1.getName () + " and " + p2.getName () 
                                + " are of the same age!");
        }
    }
}