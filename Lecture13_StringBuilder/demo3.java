public class demo3 {
    public static void main(String[] args) {
        StringBuilder rk = new StringBuilder("Hello");

        System.out.println(rk.insert(0, 'M'));

        // Another way
        rk.insert(1, 'H');
        System.out.println(rk);
    }
}
