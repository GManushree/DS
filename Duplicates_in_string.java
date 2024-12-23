public class Duplicates_in_string {
    public static void removeDuplicates(String str,int indx, StringBuilder newStr,boolean map[]) {
        if(indx==str.length()){
            System.out.println(newStr);
            return;
        }
        char curChar=str.charAt(indx);
        if(map[curChar-'a']==true){
            //duplicate
            removeDuplicates(str,indx+1,newStr,map);
            
        }
        else{
            map[curChar-'a']=true;
            removeDuplicates(str,indx+1,newStr.append(curChar),map);
        }
}
    public static void main(String[] args) {
        String str="appnnacollege";
        removeDuplicates(str,0,new StringBuilder(""),new boolean[26]);
    }
}
