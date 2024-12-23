public class Sorted {
    public static boolean isSorted(int arr[],int i) {
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
}
    
    
    //Write a func to find first occurence of an element in an array
    public static int firstOccurence(int a[],int key,int i) {
        if(i==a.length-1){
            return -1;
        }
        if(a[i]==key){
            return i;
        }
        return firstOccurence(a,key,i+1);
}
    public static int lastOccurence(int a[],int key,int i) {
        if(i==a.length){
            return-1;
        }
        int isFound=lastOccurence(a,key,i+1);
        if(isFound==-1 && a[i]==key){
            return i;
        }
        return isFound;
}
    
    //print x^n
    public static int power(int x,int n) {
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
}
    
    //optimized method to calculate x^n
 /*public static int optimizedPower(int a,int n) {
        if(n==0){
            return 1;
        }
        int halfpowerSq=optimizedPower(a,n/2)*optimizedPower(a,n/2);
        if(n%2!=0){
            halfpowerSq=a*halfpowerSq;
        }
        return halfpowerSq;
//butvthis code still takes O^n time so
}*/
     public static int optimizedPower(int a,int n) {
        if(n==0){
            return 1;
        }
        int halfpower=optimizedPower(a,n/2);
        int halfpowerSq=halfpower*halfpower;
        if(n%2!=0){
            halfpowerSq=a*halfpowerSq;
        }
        return halfpowerSq;
     }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(isSorted(arr,0));
        int a[]={8,3,6,9,5,10,2,5,3};
        System.out.println(firstOccurence(a,5,0));
        System.out.println(lastOccurence(a,5,0));
        
        System.out.println(power(2,10));
        
        System.out.println(optimizedPower(2,10));
}
}
