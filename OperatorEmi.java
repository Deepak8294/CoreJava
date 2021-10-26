public class OperatorEmi {
    public static void main(String args[]) {

        double principal = 2000;

        double rate = 12;

        double time = 1;

        rate = rate / (12 * 100);

        time = time * 12;

        double emi = (principal * rate * Math.pow(1 + rate, time)) / (Math.pow(1 + rate, time) - 1);

        System.out.print(" EMI is= " + emi + "\n");

    }
}
}s

