public class demo7 {
    public static void main(String[] args) {
        StringBuilder rk = new StringBuilder("Hello");

        for(int i=0;i<rk.length()/2 ;i++){
            int front = i ;
            int back = rk.length() - i - 1;
            
            char frontChar = rk.charAt(front);
            char backChar = rk.charAt(back);

            rk.setCharAt(front, backChar);
            rk.setCharAt(back, frontChar);
        }
        System.out.println(rk);
    }
}
