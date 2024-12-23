import java.util.*;
public class BinToDec {
    public static void dec(int binNum) {
        int myNum=binNum;
        int pow=0;
        int decNum=0;
        int Ld;
        while(binNum>0){
        Ld=binNum%10;
        decNum=decNum+(Ld*(int)Math.pow(2,pow));
        pow++;
        binNum=binNum/10;
       
    }
        System.out.println("Binary number "+myNum+"is coverted to "+decNum);
    }
    public static void main(String[] args) {
        dec(101);
    }
}
