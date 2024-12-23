import java.util.*;
public class Exception {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter two integers");
        System.out.println("Enter A");
        a=sc.nextInt();
        System.out.println("Enter B");
        b=sc.nextInt();
        try{
            if(b==0)
            {
                throw new ArithmeticException("Divide by zero");
            }
            c=a/b;
            System.out.println("The value of"+a+"/"+b+"="+c);
            }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("Enter a non zero number for B!!!");
        }
        finally
        {
            System.out.println("Finally block executed");
        }
    }
}
