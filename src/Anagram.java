import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        String str1="earth";
        String str2="heart";
        //convert strings to lowercase/uppercase
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()==str2.length()){
            char[] str1Array=str1.toCharArray();
            char[] str2Array=str2.toCharArray(); 
        //converting to char string
        Arrays.sort(str1Array);    
        Arrays.sort(str2Array);
        boolean result=Arrays.equals(str1Array, str2Array);
        if(result){
            System.out.println(str1+","+str2+" are anagrams of each other");
        }else{
            System.out.println(str1+","+str2+" are not anagrams of each other");
        }     
    }
  }
}
