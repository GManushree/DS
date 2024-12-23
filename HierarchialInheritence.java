public class HierarchialInheritence {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
        shark.swim();
        Mammal dog =new Mammal(); 
        dog.walk();
        dog.eat();
        dog.breathe();
        birds crow=new birds();
        crow.fly();
        crow.eat();
        crow.skinColor="black";
        System.out.println(crow.skinColor);
 
}
}
class Animals{
    String skinColor;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
    
}
class Fish extends Animals{
    int fins;
    void swim(){
        System.out.println("swims");
    }
}
class Mammal extends Animals{
    int legs;
    void walk(){
        System.out.println("walks");
    }
}
class birds extends Animals{
    int wings;
    void fly(){
        System.out.println("flies");
    }
}