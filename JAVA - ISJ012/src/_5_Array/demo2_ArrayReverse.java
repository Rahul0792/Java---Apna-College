package _5_Array;

public class demo2_ArrayReverse {
    public static void main(String[] args) {
        int marks[] = {10,20,30,40,50,60,70};
        int start = 0 ;
        int end= marks.length - 1;
        for(int i = start ; i< end ; i++ ){
            int flag =  marks[start];
                marks[start] = marks[end];
                marks[end] = flag;
                start++;
                end--;
        }
        for(int i = 0;i< marks.length ; i++){
            System.out.println(marks[i]);
        }
    }
}
