import java.util.*;
public class DecOrder {
    public static void printDec(int n) {
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDec(n-1);    
    }
    //increasing order
    public static void incOrder(int n) {
        if(n==1){
            System.out.print(n+" ");
            return;
        }
       
        incOrder(n-1);
        
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=10;
        printDec(n);
        incOrder(n);
    }
}
