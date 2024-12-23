public class FriendsPairing {
    public static int frpair(int n) {
        if(n==1||n==2){
            return n;
        }//single
        int fnm1=frpair(n-1);
        //pair
        int fnm2=frpair(n-2);
        int pairWays=(n-1)*fnm2;
        //totalways
        int totalWays=fnm1+pairWays;
        return totalWays;
        
}
    public static void main(String[] args) {
        System.out.println(frpair(3));
}
    
}
