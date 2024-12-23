public class MultipleInterface {
    public static void main(String[] args) {
        bear balu=new bear();
        balu.eats();
        balu.eat();
        balu.finds();
        balu.chase();
}
}
interface herbivore{
    void eats();
    void finds();
}
interface carnivore{
    void eat();
    void chase();
}
class bear implements herbivore,carnivore{
    public void eats(){
        System.out.println("eat veg");
    }
    public void finds(){
        System.out.println("search for honey ,grass");
    }
    public void eat(){
        System.out.println("eat nonveg");
    }
    public void chase(){
        System.out.println("chase rabbit,deer");
    }
}

