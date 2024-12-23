import java.util.*;
public class PrintLetters {
    public static void letters(String fullName) {
        for(int i=0;i<fullName.length();i++){
            System.out.print(fullName.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String firstName="Manu";
        String lastName="Shree";
        String fullName=firstName+" "+lastName;
        letters(fullName);
    }
}
