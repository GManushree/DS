import java.util.*;
public class Arrayl {
    ArrayList<String> dept=new ArrayList<String>();
    Scanner sc=new Scanner(System.in);
    void create()
    {
        dept.add("CSE");
        dept.add("ISE");
        dept.add("ECE");
        System.out.println("Printing array list of dept elements"+dept);
    }
    void append()
    {
        System.out.println("Enter the element to be inserted at the end of deptlist");
        String s1=sc.next();
        dept.add(s1);
        System.out.println("The updated arraylist is"+dept);
        
    }
    void addtoPos(){
        System.out.println("Enter the element and position to be inserted in the array list");
        int i=sc.nextInt();
        String s1=sc.next();
        dept.add(i,s1);
        System.out.println("Updated dept list is"+dept);
    }
    void search()
    {
        System.out.println("Enter the element to be searched in dept list");
        String s1=sc.next();
        int i=dept.indexOf(s1);
        if(i==-1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element found at"+i+"of dept list");
        }
    }
    void startchar()
    {
        System.out.println("Enter the String chharacter");
        char c=sc.next().charAt(0);
        String s1=String.valueOf(c);
        System.out.println("Dept list starting with"+s1);
        for(int i=0;i<dept.size();i++)
        {
            if(dept.get(i).startsWith(s1))
            System.out.println(dept.get(i));
        }
    }
    public static void main(String[] args) {
        Arrayl obj=new Arrayl();
        obj.create();
        obj.append();
        obj.addtoPos();
        obj.search();
        obj.startchar();
    }
}
