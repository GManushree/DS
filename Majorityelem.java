
public class Majorityelem {
    
    public static int majorityElement(int[] nums) {
        int elem=nums[0];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                elem=nums[i];
            }
            if(nums[i]==elem){
                count++;
            }else{
                count--;
            }
        }
        return elem;
    }
    public static void main(String[] args){
        int nums[]={2,2,2,2,1,1,1};
        int ans=majorityElement(nums);
        System.out.println("ans:"+ans);
        //System.out.println(majorityElement(nums));
    }
}