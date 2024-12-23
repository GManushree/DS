public class Inverted_Pyramid_numbers {
    public static void Number_pyramid(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
    }
}
    public static void main(String[] args) {
        Number_pyramid(5);
}
}
