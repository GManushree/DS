import java.util.Scanner;
public class Natural {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the last digit N");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
    }
        System.out.println("The sum of n numbers including last digit"+n+"is"+sum);
    
}
}
