package _1_Method.Constructor;


public class Demo1 {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        Movie movie2 = new Movie("Chhava","Historic Movie",5);
        System.out.println(movie2.toString());
        System.out.println(movie1.toString());
    }

}
