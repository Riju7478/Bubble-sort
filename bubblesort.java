public class p5 {


    public static void bubblesort(int array[]){
        for( int i=0;i<array.length-1;i++){
            for( int j=0;j<array.length-1-i;j++){

        
        if(array[j] > array[j+1]) {
         
        int temp=array[j];
        array[j]=array[j+1];
        array[j+1]=temp;
         

    }
}
    }
}
public static void printarr(int array[]){
    for(int k=0;k<array.length;k++){
        System.out.println(array[k]+" ");
    }
    System.out.println();
}


    
    public static void main(String args[]){
        int array[]={4,5,2,1,3};
        bubblesort(array);
        selectionsort(array);
        printarr(array);
        


    }

}

