import java.util.Scanner;
public class ExcepHandling {
    void checkAge(int age){
    try{
    if (age<18)
    {
        throw new ArithmeticException("Access denied-You must be atleast 18 years old\n");
    }
    else
    {
        System.out.println("Access granted");
    }
    }
    catch(ArithmeticException e)
    {
        System.out.println(e);
    }
    }
  
    public static void main(String[] args)
    {
        ExcepHandling obj=new ExcepHandling();
        obj.checkAge(15);
    }
}

