import java.util.*;
public class Employee {
    int empID;
    String empName;
    double empSalary;
    Scanner sc=new Scanner(System.in);
    void read()
    {
        System.out.println("Enter the employee ID");
        empID=sc.nextInt();
        System.out.println("Enter the employee Name");
        empName=sc.next();
        System.out.println("Enter the employee Salary");
        empSalary=sc.nextDouble();
    }
    void display()
    {
         System.out.println("The employee Id is"+empID);
         System.out.println("The employee Name is"+empName);
         System.out.println("The employee Salary is"+empSalary);
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Number of Employees");
        int n=obj.nextInt();
        Employee e[]=new Employee[n];
        for(int i=0;i<n;i++)
        {
        e[i]=new Employee();
        e[i].read(); 
        }
        System.out.println("The employee details are");
        for(int i=0;i<n;i++)
        {
            System.out.println("For employee"+i+" ");
            e[i].display();
        }
}
}