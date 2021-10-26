class Wrapper {
    public static void main(String[] args) {
            //object1 is equals object2
            Integer value1 = new Integer(50);
            Integer value2 = new Integer(50);
            int check = value1.compareTo(value2);
            System.out.print(check);
            //object is less than object2
            Integer a = new Integer(60);
            Integer b = new Integer(70);
            int check1 = a.compareTo(b);
            System.out.print(check1);
            //object2 is less than object1
            Integer c = new Integer(70);
            Integer d = new Integer(60);
            int check2 = c.compareTo(d);
            System.out.print(check2);
            }
      }
