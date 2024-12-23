public class MethodOverloading {
    public static void main(String[] args) {
        Calculator add=new Calculator();
        System.out.println(add.sum(5, 4));
        System.out.println(add.sum(5, 4, 2));
        System.out.println(add.sum((float)1.5, (float)2.5));
        
        
        //overriding
        deer d=new deer();
        d.eat();
        
}
}
//method overloading
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    float sum(float a,float b){
        return a+b;
    }
}
//method overriding
class Animall{
    void eat(){
        System.out.println("eats anything");
    }
}
class deer extends Animall{
    void eat(){
        System.out.println("eat grass");
    }
}
