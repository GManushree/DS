import java.util.*;
public class SumofNatnum {
    public static void main(String[] args) {
        System.out.println("Input N");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int sum=0,val=1;
        while(val<=N)
                {
                 sum=sum+val;   
                 val=val+1;
                }
        System.out.println(sum);
    }
}
