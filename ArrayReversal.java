public class ArrayReversal {
    public static void reverse(int numbers[]) {
        int first=0,last=numbers.length-1;
        int temp;
        while(first<last){
            temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        reverse(numbers);
        System.out.println("The reversed array is:");
        for(int i=0;i<numbers.length;i++){
        System.out.print(numbers[i]+" ");
        }
    }
}
