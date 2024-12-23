import java.util.*;
public class Optimized_bubble_sort {
    public static void sorter(int arr[]) {
        for(int turn=0;turn<arr.length-1;turn++){
            int swap=0;
            boolean swapped=false;
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                    swap++;
                }
                if(swapped==false){
                    break;
                }

                }
                 if(swap==0){
                    break;   
            }
        }
}
    public static void print(int arr[]) {
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            
        }
       System.out.println();
}
    public static void main(String[] args) {
        int arr[]={5,3,2,1,4};
        sorter(arr);
        print(arr);
        
}
}

