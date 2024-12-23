public class SumofNatNumbers {
    public static int sum(int n) {
        if(n==1){
            return 1;
        }
        int SnMinus1=sum(n-1);
        int Sn=n+SnMinus1;
      return Sn;
}
    
    //fibonacci
    public static int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        int Fnm1=fib(n-1);
        int Fnm2=fib(n-2);
        int Fn=Fnm1+Fnm2;
        return Fn;
}
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
        System.out.println(fib(n));
}
}
