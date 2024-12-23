import java.util.*;
class Staff{
    String Staffid,Name,Phone,Salary;
    Scanner sc=new Scanner(System.in);
    void read(){
        System.out.println("Enter Staffid");
        Staffid=sc.nextLine();
        System.out.println("Enter Name");
        Name=sc.nextLine();
        System.out.println("Enter Phoneno");
        Phone=sc.nextLine();
        System.out.println("Enter Salary");
        Salary=sc.nextLine();
    }
    void display()
    {
        System.out.println("Staffid");
        System.out.println(Staffid);
        System.out.println("Name");
        System.out.println(Name);
        System.out.println("Phoneno");
        System.out.println(Phone);
        System.out.println("Salary");
        System.out.println(Salary);
    }
}
class Teaching extends Staff{
    String Domain,Publication;
    void read()
    {
        super.read();
        System.out.println("Enter Domain");
        Domain=sc.nextLine();
        System.out.println("Enter Publication");
        Publication=sc.nextLine();
    }
    void display()
    {
        super.display();
        System.out.println("Domain");
        System.out.println(Domain);
        System.out.println("Publication");
        System.out.println(Publication);
    }
}
class Technical extends Staff{
    String Skills;
    void read()
    {
        super.read();
        System.out.println("Enter skills");
        Skills=sc.nextLine();
    }
    void display()
    {
        super.display();
        System.out.println("Skills");
        System.out.println(Skills);
    }
}
class Contract extends Staff{
    String period;
    void read()
    {
        super.read();
        System.out.println("Enter period");
        period=sc.nextLine();
    }
    void display()
    {
      super.display();
      System.out.println("Period");
      System.out.println(period);
    }
}
public class StaffDetails {
        public static void main(String[] args) 
       {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Staff details");
        int n=sc.nextInt();
        Teaching ts[]=new Teaching[n];
        Technical tech[]=new Technical[n];
        Contract c[]=new Contract[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Teaching Staff details");
            ts[i]=new Teaching();
            ts[i].read();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Technical Staff details");
            tech[i]=new Technical();
            tech[i].read();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Contract Staff details");
            c[i]=new Contract();
            c[i].read();
        }
        System.out.println("Staff Details");
        System.out.println("Teaching Staff Details");
        for(int i=0;i<n;i++)
        {
            ts[i].display();
        }
        System.out.println("Technical Staff Details");
        for(int i=0;i<n;i++)
        {
            tech[i].display();
        }
        System.out.println("Contract Staff details");
        for(int i=0;i<n;i++)
        {
            c[i].display();
        }
    }
}
