public class TilingProblem {
    public static int tiles(int n) {//2xn floor size
        if(n==0||n==1){
            return 1;
        }
        //vertical choice
        int fnm1=tiles(n-1);
        //horizontal choice
        int fnm2=tiles(n-2);
        int totalWays=fnm1+fnm2;
        return totalWays;
}
    public static void main(String[] args) {
        System.out.println(tiles(3));
}
}
