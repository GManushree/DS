public class SubString {
    public static String sub(String str,int si,int ei) {
        String subStr="";
        for(int i=si;i<ei;i++){
            subStr+=str.charAt(i);
        }
        return subStr;
}
    public static void main(String[] args) {
        String str="HelloWorld";
        System.out.println(sub(str,0,5));
        //direct method
        System.out.println(str.substring(0, 5));
}
}
