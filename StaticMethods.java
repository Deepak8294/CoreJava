 class StaticMethods {
    //static variable
    static int num;
    static String str;
    static int y;
    //non static variable
    int x = 10;
    //static block
    static {
        num = 5;
        str = "Raja";
    }
    //static  method
    public static void main(String[] args) {
        System.out.println("the value of num is:" + num);
        System.out.println("the value of str is:" + str);
        System.out.println(y);
        StaticMethods d1 = new StaticMethods();
        System.out.println(d1.x);
    }
}
