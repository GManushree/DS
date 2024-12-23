import java.util.*;
public class ArraysCC {
    public static void update(int marks[],int Non_changeable) {
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
            Non_changeable=10;
        }
    }
    public static void main(String[] args) {
        int marks[]={97,95,98};
        int Non_changeable=5;
        update(marks,Non_changeable);
        System.out.println(Non_changeable);//no updation
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");//pass by reference is used by arrays so there is updatation
        }
        System.out.println();
    }
}
