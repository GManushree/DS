public class Keyword_static {
    public static void main(String[] args) {
        student s1=new student();
        s1.SchoolName="Abc";
        System.out.println(s1.returnPercentage(10,20,15));
        student s2=new student();
        System.out.println(s2.SchoolName);
        System.out.println(s2.returnPercentage(15,20,15));
        
}
}
class student{
    String name;
    int rollNo;
    static String SchoolName;
    void setName(String name){
        this.name=name;
        
    }
    String getName(){
        return name;
    }
    static int returnPercentage(int chem,int math,int phy){
        return ((chem+math+phy)/3);
    }
}
