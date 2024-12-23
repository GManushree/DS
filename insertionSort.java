
/*import java.util.*;
public class insertionSort {
    public static void sort(int arr[]) {
        for(int i=1;i<arr.length;i++){
            int cur=i;
            int prev=i-1;
            while(prev>=0 && arr[prev]>arr[cur]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=cur;
        }
        
    }
    public static void printarr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        sort(arr);
        printarr(arr);
    }
}*/
/*
import java.util.*;
public class insertionSort {
    public static void sort(int arr[]) {
        for(int i=1;i<arr.length;i++){
            int cur=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>cur){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=cur;
        }
        
    }
    public static void printarr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        sort(arr);
        printarr(arr);
    }
}
*/
import java.util.*;
public class insertionSort{
    public static void insertion(int arr[]) {
        for(int i=1;i<arr.length;i++){
            int cur=arr[i];
            int prev=i-1;
            while(prev>=0 &&arr[prev]>cur){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=cur;
        }
    }
    public static void print(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        insertion(arr);
        print(arr);
        
    }
}
