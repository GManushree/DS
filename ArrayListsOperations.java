
import java.util.ArrayList;

public class ArrayListsOperations{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Boolean> list2=new ArrayList<>();
        ArrayList<String> list3=new ArrayList<>();


        //Add element-o(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.size());

        list.add(1,9);
        System.out.println(list);

        //get operation
        //int element=list.get(2);
        //System.out.println(element);

        //delete-o(n)
        //list.remove(2);
        //System.out.println(list);

        //set operation
        list.set(2,10);
        System.out.println(list);

        //contains
        
        System.out.println(list.contains(1));

        //print arraylist
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //reverse print-o(n)
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }

    }
}