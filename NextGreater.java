import java.util.*;
public class NextGreater{
    public static void main(String[] args) {
        
    
    int arr[]={6,8,0,1,3};
    Stack<Integer> s=new Stack<>();
    int nxtGrtr[]=new int[arr.length];

    for(int i=arr.length-1;i>=0;i--){
        //while
        while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
            s.pop();
        }
        //if-else
        if(s.isEmpty()){
            nxtGrtr[i]=-1;
        }else{
            nxtGrtr[i]=arr[s.peek()];
        }
        //push
        s.push(i);

}
        for(int i=0;i<nxtGrtr.length;i++){
            System.out.print(nxtGrtr[i]+" ");
        }
}
}