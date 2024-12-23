import java.util.*;
public class Employees {
    int empId;
    String empName;
    double empSalary;
    Scanner sc=new Scanner(System.in);
    void read()
    {
        System.out.println("Enter empId ,empName, empSalary");
        empId=sc.nextInt();
        empName=sc.next();
        empSalary=sc.nextDouble();
    }
    void display()
    {
        System.out.println("The employee details are"+empId+" "+empName+" "+empSalary);
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of employee details");
        int n=obj.nextInt();
        Employee e[]=new Employee[n];
        for(int i=0;i<n;i++){
        e[i]=new Employee();
        e[i].read();              
    }
        System.out.println("The employee details are as follows");
        for(int i=0;i<n;i++){
            e[i].display();
        }
    }
}
