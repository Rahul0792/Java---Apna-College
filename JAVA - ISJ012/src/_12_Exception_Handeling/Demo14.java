package _12_Exception_Handeling;
import java.util.Scanner;
public class Demo14 {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        if (age < 18) {
            throw new InvalidAgeException("under 18");
        } else {
            System.out.println("You are above 18 and eligible to vote");
        }
    }
}
