public class Floyds_Triangle {
    public static void floydstriangle(int n) {
        int i,j,counter=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(counter+"  ");
                counter++;
            }
            System.out.println();
        }
}
    public static void main(String[] args) {
        floydstriangle(5);
}
}
