import java.util.*;
public class LinearSearch {
    public static int linsearch(int numbers[],int key) {
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={20,25,28,30,27,24};
        int key=30;
        int index=linsearch(numbers,key);
        if(index==-1){
            System.out.println("Key not found");
        }
        System.out.println("Key found at index "+index);
    }
}
