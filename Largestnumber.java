


public class Largestnumber{
    public static void main(String[] args) {

        int numbers[]={1,5,9,7,11,6,14};
        int large=getLargest(numbers);
        System.out.println("largest "+large);
    }
    public static int getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
            
            
        }
        System.out.println("smallest:"+smallest);
        return largest;
    }
    
}