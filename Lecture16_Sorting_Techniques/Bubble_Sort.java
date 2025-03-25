public class Bubble_Sort {
    public static void main(String[] args) {
        int marks[]= {50,40,30,5,2};

        // Bubble sort
        for(int i=0;i<marks.length-1;i++){
            for(int j=0 ;j<marks.length-i-1;j++){
                if(marks[j] > marks[j+1]){
                    int flag = marks[j];
                    marks[j]=marks[j+1];
                    marks[j+1]= flag;
                }
            }
        }
        for(int i = 0;i<marks.length;i++){
            System.out.print(marks[i] + " ");
        }

    }
}
