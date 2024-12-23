import java.util.*;
interface Resumee
{
    void biodata();
}
class Teachers implements Resumee
{
    String name,qualification,achievements;
    float experience;
    public void biodata(){
    name="ABC";
    qualification="MTECH";
    achievements="Best teacher Awardee";
    experience=10.5f; 
    System.out.println("Teacher Resume");
    System.out.println("Name: "+name);
    System.out.println("Qualification: "+qualification);
    System.out.println("Achievements: "+achievements);
    System.out.println("Experience: "+experience);
    System.out.println("Skill set:proficient in Operating systems,Python,java,datata structures");
    }
}
class Students implements Resumee
{
    String name,discipline;
    float result;
    public void biodata()
    {
     name="ABC";
     discipline="Information Science And Engineering";
     result=9.4f;
    System.out.println("Student details");
    System.out.println("Name:"+name);
    System.out.println("Discipline"+discipline);
    System.out.println("Result:"+result);
    System.out.println("Highlights:Participated in hackathons and other coding competitions");
    }
}
public class Interfacepgm
{
    public static void main(String[] args) {
        Teachers obj1=new Teachers();
        obj1.biodata();
        Students obj2=new Students();
        obj2.biodata();
    }
}





