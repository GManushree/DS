import java.util.*;
public class Matrix {
    public static boolean search(int array[][],int key) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j]==key){
                System.out.println("Key found at cell ("+i+","+j+")");
                return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void print(int array[][]) {
     
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int largestElement(int array[][]) {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j]>largest){
                    largest=array[i][j];
                }
            }
        }
        return largest;
    }
    public static int smallestElement(int array[][]) {
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j]<smallest){
                    smallest=array[i][j];
                }
            }
        }
        return smallest;
    }
    
    public static void main(String[] args) {
        int array[][]=new int[3][3];
        int m=array.length;
        int n=array[0].length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array elements");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                array[i][j]=sc.nextInt();
            }
        }
        print(array);
        search(array,5);
        System.out.println(largestElement(array)+" is the largest element in the array");
        System.out.println(smallestElement(array)+" is the smallest element in the array");
      
    }
}
