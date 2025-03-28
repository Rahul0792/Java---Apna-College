package _5_Array;

public class demo5_MinElementInArray {
    public static void main(String[] args) {
        int marks[] = {10,20,30,40,50,60,1,2,900,3};

        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < marks.length ; i++){
            if(marks[i] > max ){
                max = marks[i];
            }
        }
        System.out.println(max);
    }
}
