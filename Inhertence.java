public class Inhertence {
    public static void main(String[] args) {
       /* Fish shark=new Fish();
        shark.eat();
        shark.swims();
        */
        Dog shepard=new Dog();
        shepard.eat();
        shepard.legs=4;
        shepard.breed();
        System.out.println(shepard.legs);
}
    
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
/*
class Fish extends Animal{
    int fins;
    void swims(){
        System.out.println("Fish swims");
    }
}*/
//multilevel inheritence
class Mammals extends Animal{
    int legs;
}
class Dog extends Mammals{
    void breed(){
        System.out.println("The bread is shepard");
    }
}
