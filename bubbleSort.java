public class bubbleSort {
    public static void sort(int arr[]) {
        for(int turn=0;turn<arr.length-1;turn++){
            int swap=0;
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
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
        int arr[]={5,4,1,3,2};
        sort(arr);
        print(arr);
        
}
}
