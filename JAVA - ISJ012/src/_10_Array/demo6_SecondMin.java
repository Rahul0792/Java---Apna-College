package _10_Array;

public class demo6_SecondMin {
    public static void main(String[] args) {
        int marks[] = {10,20,30,40,50,60,1,2,900,3,1000};

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0 ; i < marks.length ; i++){
            if(marks[i] > firstMax ){
                secondMax = firstMax;
                firstMax = marks[i];
            }
            if (marks[i] > secondMax && marks[i] < firstMax) {
                secondMax = marks[i];
            }
        }
        System.out.println(secondMax);
    }
}
