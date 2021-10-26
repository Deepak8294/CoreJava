class Switch {
    public static void main(String[] args) {
        //Declaring a variable for switch expression  
        int month = 10;
        //Switch expression  
        switch (month) {
            //Case statements 
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("Decmber");
                break;
                //Default case statement 
            default:
                System.out.println("Invalid Month!");
        }
        //Printing month of the given number  
        System.out.println("10");
    }
}
