public class InvertedHalfRotatedPyramid {
     public static void main(String[] args) {
        Pyramid(4);
    }
    public static void Pyramid(int n) {
       for(int i=1;i<=n;i++){
           for(int j=1;j<=n-1;j++){
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }
        
    }
   
}
