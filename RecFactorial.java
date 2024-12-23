public class RecFactorial {
    public static int fact(int n) {
        if(n==0){
            return 1;
        }
        int Fnminus1=fact(n-1);
        int fN=n*Fnminus1;
        return fN;
}
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
}
}
