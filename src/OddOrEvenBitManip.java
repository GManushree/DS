public class OddOrEvenBitManip {
    public static void oddOrEven(int n) {
        int bitMask=1;
        if((n&bitMask)==0){
            System.out.println(n+" is a even no");
        }
        else{
            System.out.println(n+" is a odd no");
        }
}
    public static int getithBit(int n,int i) {
        int bitMask=1<<i;
        if((n&bitMask)==0){
            return 0;
        }else{
            return 1;
        }
}
    public static int setIthBit(int n,int i) {
        int bitMask=1<<i;
        return n|bitMask;
    }
    public static int clearithBit(int n,int i){
        int bitMask=~(1<<i);
        return n&bitMask;
    }
    public static int updateIthBit(int n,int i,int newBit) {
      /*  //1st method
        if(newBit==0){
            return clearithBit(n,i);
        }else{
            return setIthBit(n,i);
        }*/
        //2nd method
        n=clearithBit(n,i);
        int BitMask=newBit<<i;
        return n|BitMask;
        
}
    public static int clearRangeofBits(int n,int i,int j) {
        int a=(~0)<<j+1;
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n&bitMask;
}
   public static int clearLastIBits(int n,int i) {
       int bitMask=(-1)<<i;
       return n&bitMask;
}
   //check if a number is a power of 2
   public static boolean powerOfTwo(int n) {
       return (n&(n-1))==0;


   }
   public static int countSetBits(int n) {
       int count=0;
       while(n>0){
           if((n&1)!=0){
               count++;
           }
           n=n>>1;
       }
       return count;
}

    public static void main(String[] args) {
        oddOrEven(5);
        oddOrEven(2);
        oddOrEven(17);
        oddOrEven(8);
        System.out.println(getithBit(15,2));
        System.out.println(getithBit(10,2));
        System.out.println(getithBit(10,1));
        System.out.println(setIthBit(10,2));
        System.out.println(clearithBit(10,1));
        System.out.println(updateIthBit(10,1,0));
        System.out.println(updateIthBit(10,2,1));
        System.out.println(clearLastIBits(15,2));
        System.out.println(clearRangeofBits(10,2,4));
        System.out.println(powerOfTwo(15));
        System.out.println(countSetBits(10));
        
}
}

