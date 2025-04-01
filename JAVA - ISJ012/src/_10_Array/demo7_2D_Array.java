package _10_Array;

public class demo7_2D_Array {
    public static void main(String[] args) {
        int marks[][] = {
                {10,20,30},
                {40,50,60,100},
                {70,80,90,100,111,112}
        };

        for(int row = 0 ; row < marks.length ; row++){
            for(int col = 0 ; col < marks[row].length ; col++){
                System.out.print(marks[row][col] + " ");
            }
            System.out.println();
        }
    }
}
