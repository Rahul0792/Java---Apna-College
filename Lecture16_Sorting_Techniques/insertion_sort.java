class insertion_sort{
    public static void main(String[] args) {
        int array[] = {50,20,30,10,80,90};
        int j;

        for (int i = 0 ; i<array.length-1 ;i++) {
            int smallest = i;
            for( j= i+1 ;j<array.length ;j++){
                if(array[smallest]> array[j]){
                    smallest = j;
                }
            }
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i]=temp;
        }
        for(int i = 0 ; i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}