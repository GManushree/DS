import java.util.Scanner;
public class Student {
    String USN,Name,Branch,Phone;
    Scanner sc=new Scanner(System.in);
    void read()
    {
        System.out.println("Enter USN");
        USN=sc.next();
        System.out.println("Enter Name");
        Name=sc.next();
        System.out.println("Enter Branch");
        Branch=sc.next();
        System.out.println("Enter Phone number");
        Phone=sc.next();
    }
    void display()
    {
        System.out.println(USN+"\t\t"+Name+"\t\t"+Branch+"\t\t"+Phone);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of student details");
        int n=sc.nextInt();
        Student s[]=new Student[n];
        System.out.println("Student details are");
        for(int i=0;i<n;i++)
        {
           s[i]=new Student();
           s[i].read();
        }
        System.out.println("USN\t\tName\t\tBranch\t\tPhoneno");
        for(int i=0;i<n;i++)
        {
            s[i].display();
        }
    }
    
}
