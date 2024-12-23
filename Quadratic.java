import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
      double r1,r2,real,imag;   
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        double a=sc.nextDouble();
        System.out.println("Enter the value of b");
        double b=sc.nextDouble();
        System.out.println("Enter the value of c");
        double c=sc.nextDouble();
        double d=(b*b)-4*a*c;
        System.out.println("Determinant is:"+d);
        if(d==0){
            double x=(-b/2*a);
            System.out.println("Roots are real and equal");
    }
        else if(d>0)
        {
            r1=(-b+Math.sqrt(d)/2*a);
            r2=(-b-Math.sqrt(d)/2*a);
            System.out.println("r1="+r1+" r2="+r2);
            System.out.println("Roots are real and distinct");
        }
        else
        {
            real=(-b/2*a);
            imag=(Math.sqrt(Math.abs(d))/2*a);
            System.out.println(real+"+i"+imag);
            System.out.println(real+"-i"+imag);
        }
    }
    
    
}
