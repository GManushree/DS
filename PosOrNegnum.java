import java.util.*;
public class PosOrNegnum {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    if(num>0){
            System.out.println(num + " is positive");
    }
    else{
        System.out.println(num + " is negative");
    }
}
}