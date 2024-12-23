
import java.util.ArrayList;
public class pairSum{
    // public static boolean pairs(ArrayList<Integer> list,int target) {
    //     for(int i=0;i<list.size();i++){
    //         for(int j=i+1;j<list.size();j++){
    //             if(list.get(i)+list.get(j)==target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    public static boolean pairSum1(ArrayList<Integer> list,int target) {
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            else if(list.get(lp)+list.get(rp)>target){
                rp--;
            }
            else{
                lp++;
            }
        }
        return false;
    }

    //two pointer:sorted rotated list
    public static boolean pairSum2(ArrayList<Integer> list2,int target2) {
        int bp=-1;
        int n=list2.size();
        for(int i=0;i<list2.size();i++){
            if(list2.get(i)>list2.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while(lp!=rp){
            //case1
            if(list2.get(lp)+list2.get(rp)==target2){
                return true;
            }
            //case 2
            if(list2.get(lp)+list2.get(rp)<target2){
                lp=(lp+1)%n;
                
            }
            else{
                
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=5;
        System.out.println(pairSum1(list, target));
        //Sorted Rotated Array list
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(11);
        list2.add(15);
        list2.add(6);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        int target2=16;
        System.out.println(pairSum2(list2, target2));//o(n)
    }
}