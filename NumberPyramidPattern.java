public class NumberPyramidPattern {
    public static void numpyramid(int n) {
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
}
            for(int j=1;j<=i;j++){
                System.out.print(i);
                if(j!=i){
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            
            System.out.println();
}
    }
    public static void main(String[] args) {
        numpyramid(5);
}
}