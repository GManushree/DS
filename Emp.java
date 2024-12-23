import java.util.*;
public class Emp {
    int eid;
    String name;
    String dept;
    int salary;
    Emp()
    {
        System.out.println("Default constructor");
    }
    Emp(int eID,String eName, String eDept,int eSal)
    {
        eid=eID;
        name=eName;
        dept=eDept;
        salary=eSal;
    }
    public static void main(String[] args) {
        Emp e1=new Emp();
        System.out.println("Employee details are : "+e1.eid+""+e1.name+""+e1.dept+""+e1.salary);
        Emp e2=new Emp(101,"ABC","ISE",98000);
        System.out.println("Employee details are : "+e2.eid+""+e2.name+""+e2.dept+""+e2.salary);
    }
}
