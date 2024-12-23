import java.util.*;
public class DecToBin {
    public static void bin(int n) {
        int MyNum=n;
        int pow=0;
        int binNum=0;
        while(n>0){
            int rem=n%2;
            binNum=binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("Decimal no "+MyNum+" to binary number is"+binNum);
    }
    public static void main(String[] args) {
        bin(4);
    }
}
