package _12_Exception_Handeling;

public class Demo12 {
    public static void main(String[] args) {
        try {
            System.out.println(divide(100, 0));
        } catch (ArithmeticException e) {
            System.out.println("invalid denominator");
        }
        System.out.println("rest of the main");

    }

    private static int divide(int number1, int number2) throws ArithmeticException {
        return number1 / number2;
    }

}
