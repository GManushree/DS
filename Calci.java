import java.util.*;
public class Calci {
    public static void main(String[] args) {
        int res;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a");
        int a=sc.nextInt();
        System.out.println("Enter b");
        int b=sc.nextInt();
        System.out.println("Enter the operator/symbol");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case '+':System.out.println("result = "+(a+b));
                break;
            case '-':System.out.println("result = "+(a-b));
                break;
            case '*':System.out.println("result = "+(a*b));
                break;
            case '/':System.out.println("result = "+(a/b));
                break;
            case '%':System.out.println("result = "+(a%b));
                break;
            default:System.out.println("Invalid operand");
            
    }
        
    }
}
