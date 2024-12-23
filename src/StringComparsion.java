public class StringComparsion {
    public static void main(String[] args) {
        String s1="Tony";
        String s2="Tony";
        String s3=new String("Tony");
        if(s1==s2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        if(s1==s3){//using == dont check value wise it checks objectwise so we dont use this
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        if(s1.equals(s3)){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
        
}
}
