import java.util.*;
import java.util.Arrays;
/*
public class InbuiltSort {
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
       // Arrays.sort(arr);//outupt:1,2,3,4,5
       // To sort particular index to particular index we use this -to sort 3 elements i.e to sort index0,1,2 si=0;ei=3
        Arrays.sort(arr,0,3);//output:1,4,5,3,2
        printArray(arr);
    }
}
    */
//inbuilt reverse sorting
import java.util.Collections;
public class InbuiltSort{
        public static void printArray(Integer arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        //primitive datatypes cannot be used
        Integer arr[]={4,5,3,1,2};
       // Arrays.sort(arr,Collections.reverseOrder());
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        printArray(arr);
    }
}
