package _12_Exception_Handeling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        try {
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            System.out.println("Division is " + number1 / number2);
            System.out.println("rest of the try");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("rest of the code in the main");
    }
}
