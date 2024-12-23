import java.util.*;
class Vehicle{
    Scanner obj =new Scanner(System.in);
    String brand;
    String price;
    void read()
    {
        System.out.println("Enter the vehicle brand and price");
        brand=obj.next();
        price=obj.next();
    }
    void display()
    {
        System.out.println("Vehicle details are as follows");
        System.out.println("Brand"+brand+"Price"+price);
    }
        }
class Car extends Vehicle{
String ModelName,color;
void read(){
    super.read();
    System.out.println("Enter ModelName and color");
    ModelName=obj.next();
    color=obj.next();   
}
void display()
{
    super.display();
    System.out.println("ModelName"+ModelName+"Color"+color);
}
}
public class VehicleInfo {
    public static void main(String[] args) {
        Car myCar=new Car();
        myCar.read();
        myCar.display();
    }
}
