
import java.util.*;

public class QusingJCF{//Queue implementation using java collection framework
    public static void main(String[] args) {
       // Queue<Integer> q=new LinkedList<>();//ArrayDeque and linkedin can implement queues using jcf 
       Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

   }
}