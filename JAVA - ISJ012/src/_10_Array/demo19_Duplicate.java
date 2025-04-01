package _10_Array;

import java.util.Arrays;

public class demo19_Duplicate {
    public static void main(String[] args) {
        int array[] = {10,20,50,1,2,3,10,90,11};

        Arrays.sort(array);
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i]+ " ");
        }

        for(int i = 0 ; i < array.length ; i++){
            if(array[i] == array[i+1]){
                System.out.println("Duplicate value "+ array[i] + " found at index : " + i );
                break;
            }
        }
    }
}
