import java.util.*;
public class MaxSubarray {
    public static void printmax(int number[]) {
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                cursum=0;
                for(int k=start;k<=end;k++)
                {
                    System.out.print(number[k]+" ");
                    cursum+=number[k];
                
                }
                    System.out.println("    cursum:"+cursum);
                    if(maxsum<cursum){
                        maxsum=cursum;
                    
                    }
            }
        }
            System.out.println("maxsum:"+maxsum);
}
    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3};
        printmax(number);
        
    }
}
