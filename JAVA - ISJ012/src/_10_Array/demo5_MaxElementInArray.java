package _10_Array;

public class demo5_MaxElementInArray {
    public static void main(String[] args) {
        int marks[] = {10,20,30,40,50,60,70,5};

        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i< marks.length ; i++ ){
            if(min > marks[i]){
                min = marks[i];
            }
        }
        System.out.println(min);
    }
}
