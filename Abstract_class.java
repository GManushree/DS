public class Abstract_class {
    public static void main(String[] args) {
        dog d=new dog();
        d.eat();
        d.walks();
        Hen chick=new Hen();
        chick.eat();
        chick.walks();
        System.out.println(d.color);
        System.out.println(d.changeColor());
        System.out.println(chick.color);
        System.out.println(chick.changeColor());
        
        puppy myDog=new puppy();
        //animal->dog->puppy constructors are called
        
        
}
}
abstract class Animmal{
    String color;
    Animmal(){
        color="brown";
        System.out.println("Animal constructor is called");
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walks();
}
class dog extends Animmal{
    dog(){
        System.out.println("dog constructor is caled");
    }
    String changeColor(){
        color="dark brown";
        return color;
    }
    void walks(){
        System.out.println("dog walks with 4 legs");
    }
}
class puppy extends dog{
    puppy(){
        System.out.println("puppy constructor is called");
    }
}
class Hen extends Animmal{
    String changeColor(){
        color="yellow";
        return color;
    }
    void walks(){
        System.out.println("Walks with 2 legs");
    }
}
