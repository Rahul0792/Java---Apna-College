package _10_Array;

public class demo18_Transpose {
    public static void main(String[] args) {
        int array[][] = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
        int transpose[][] = new  int [array.length][array[0].length];

        System.out.println("Original Matrix");
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[i].length;j++){
                transpose[i][j] = array[j][i];
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix");

        for(int i = 0 ; i < transpose.length ; i++){
            for(int j = 0 ; j < transpose[i].length;j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
