public class Super_ {
    public static void main(String[] args) {
        Doreme dora=new Doreme();
      //  System.out.println(dora.color);
        
}
}
class Doremon{
    Doremon(){
        String color;
        color="blue";
        System.out.println("Doremon constructor is called");
    }
}
class Doreme extends Doremon{
    Doreme(){
        super();
        //super.color="pink";
        System.out.println("Doreme constructor is called");
    }
}
