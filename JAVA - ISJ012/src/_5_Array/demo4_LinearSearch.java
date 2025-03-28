package _5_Array;

public class demo4_LinearSearch {
    public static void main(String[] args) {
        int marks[] = { 10,20,30,40,50,60,70,80,90};

        int num=50;
        boolean flag = false;
        int i;
        for( i = 0 ; i < marks.length ; i++){
            if(marks[i] == num){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Number found " + num + " at location " + i);
        } else {
            System.out.println("Number not found ");
        }
    }
}
