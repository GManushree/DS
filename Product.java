import java.util.*;
public class Product {
   // public static void main(String[] args) {
   
//        int a=10;
//        int b=5;
//        int ans;
////        Scanner sc=new Scanner(System.in);
////        a=sc.nextInt();
////        b=sc.nextInt();
//        ans=mul(a,b);
//        System.out.println("Product: "+ans);
//    }
//    public static int mul(int c,int d) {
//        int Pro=c*d;
//        return Pro;
        
        
        
        //Factorial of a number
    public static int factorial(int n) {
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
        
    }
    public static int BinCoeff(int n,int r) {
        //formula=n!/(n-r)!/r!
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_n_minus_r=factorial(n-r);
        int coefficient=fact_n/(fact_r*fact_n_minus_r);
        return coefficient;
        
    }
    public static void main(String[] args) {
        System.out.println("Binomial Coefficient of is "+BinCoeff(5,2));
    }
}
