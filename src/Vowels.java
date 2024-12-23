import java.util.*;
public class Vowels {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        String input=new Scanner(System.in).next();
        int count=0;
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println(count);
}
}
