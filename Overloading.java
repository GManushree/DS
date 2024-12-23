import java.util.*;
public class Overloading {
    void add(int a,int b)
    {
        System.out.println("The addition of 2 numbers is :"+(a+b));
    }
    void add(double a,double b)
    {
        System.out.println("The addition of 2 numbers is :"+(a+b));
    }
    void add(int a,int b,int c)
    {
        System.out.println("The addition of 3 numbers is : "+(a+b+c));
    }
    public static void main(String[] args) {
        Overloading ob=new Overloading();
        ob.add(5,10);
        ob.add(542.452,3241.3256);
        ob.add(3,4,5);
    }
}
