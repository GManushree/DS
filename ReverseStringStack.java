import java.util.*;
public class ReverseStringStack{
    public static String ReverseString(String str){
        Stack<Character> s=new Stack<>();
        int indx=0;
        while(indx<str.length()){
            s.push(str.charAt(indx));
            indx++;
        } 
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr=s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args){
        String str="abc";
        String result=ReverseString(str);
        System.out.println(result);
    }
}