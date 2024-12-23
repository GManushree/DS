public class HybridInheritence {
    public static void main(String[] args) {
        Aquatic fish=new Aquatic();
        fish.eat();
        fish.livesIn();
        tuna group=new tuna();
        group.breathes();
        group.feature();
        shark sharkie=new shark();
        sharkie.eat();
        sharkie.teeth();
        Terestrial rabbit=new Terestrial();
        rabbit.eat();
        rabbit.lives();
        human manu=new human();
        manu.eat();
        manu.legs();
        cat pillodu=new cat();
        pillodu.breathes();
        pillodu.legs();
        pillodu.lives();
        
}
}
class livingOrganisms{
    void eat(){
        System.out.println("eats");
    }
    void breathes(){
        System.out.println("breathes");
    }
}
class Aquatic extends livingOrganisms{
    void livesIn(){
        System.out.println("Water");
    }
}
class tuna extends Aquatic{
    void feature(){
        System.out.println("tuna is black");
    }
}
class shark extends Aquatic{
    void teeth(){
        System.out.println("sharp teeth");
    }
}
class Terestrial extends livingOrganisms{
    void lives(){
        System.out.println("on land");
    }
}
class cat extends Terestrial{
    void legs(){
        System.out.println("4 legs");
    }
}
class human extends Terestrial{
    void legs(){
        System.out.println("2 legs");
    }
}