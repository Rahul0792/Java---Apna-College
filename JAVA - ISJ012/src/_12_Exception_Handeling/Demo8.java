package _12_Exception_Handeling;

public class Demo8 {
    public static void main(String[] args) {
        System.out.println(getNumber());
        //output: 3
    }

    private static int getNumber() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
}
