package _12_Exception_Handeling;

public class Demo9 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
            System.out.println(10 / 0);
            int[] array = {};
            System.out.println(array[0]);
        } catch (ArithmeticException e) {
            System.out.println("invalid denominator");
        } catch (NullPointerException e) {
            System.out.println("null pointer");
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("invalid index");
        }
    }
}
