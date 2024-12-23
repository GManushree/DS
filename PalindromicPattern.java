public class PalindromicPattern {
    public static void palindromicNumbers(int n) {
       for(int i=1;i<=n;i++){
        //spaces
           for(int j=1;j<=n-i;j++){
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
               if(i==5){
                   System.out.println("1");
               }
               System.out.println();
               if(i==4||i==6){
                   System.out.println("2");
               }
               System.out.println();
               if(i==3||i==7){
                   System.out.println("3");
               }
               System.out.println();
               if(i==2||i==8){
                   System.out.println("4");
               }
               System.out.println();
               if(i==1||i==9)
                   System.out.println("5");
              
           }
}
    }
    public static void main(String[] args) {
        palindromicNumbers(5);
}

        

}
