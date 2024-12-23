public class Constructors {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Manu";
        s1.roll=456;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=98;
        s1.marks[2]=95;
        Student s2=new Student(s1);
        s2.password="xyz";
        s2.marks[2]=99;//this must not be updated so we have an another methods
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        /*
        Student s2=new Student("Manu");
        Student s3=new Student(42);
        System.out.println(s2.name);
        System.out.println(s3.roll);*/
        
        
        
}
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];
    //copy constructor
  /*  Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }*/
    //deep constructor
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }
    
    Student(){
         marks=new int[3];
        System.out.println("Constructor is called");  
}
    Student(String name){
         marks=new int[3];
        this.name=name;

}
    Student(int roll){
         marks=new int[3];
        this.roll=roll;
    }
}
