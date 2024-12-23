import java.util.*;
public class LargestNumber {
    public static int getlargest(int numbers[]) {
        int largest =Integer.MIN_VALUE;//-Infinity
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i])
                largest=numbers[i];
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,6,3,5};
        getlargest(numbers);
        System.out.println("The largest number is "+getlargest(numbers));
        
    }
}
