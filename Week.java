import java.util.*;
public class Week {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        switch(num){
            case 1:System.out.println("MONDAY");
                break;
            case 2:System.out.println("TUESDAY");
                break;
            case 3:System.out.println("WEDNESDAY");
                break;
            case 4:System.out.println("thursDAY");
                break;
            case 5:System.out.println("FriDAY");
                break;
            case 6:System.out.println("SaturDAY");
                break;
            case 7:System.out.println("SUNDAY");
                break;
            default:System.out.println("There only 7 days");
        }
    }
}
