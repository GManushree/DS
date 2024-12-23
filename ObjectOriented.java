public class ObjectOriented {
    public static void main(String[] args) {
        //creating objects
        Pen p1=new Pen();
        p1.setColor("black");
        System.out.println("color:"+p1.color);
        p1.color="yellow";
        System.out.println("color:"+p1.color);
        p1.setTip(10);
        System.out.println("Thickness:"+p1.tip);
        
        
        
        BankAccount myAcc=new BankAccount();
        myAcc.username="Manu";
        //myAcc.password("xyz");cant be done
        System.out.println(myAcc.username);
        
        myAcc.setPassword("abc");
        //System.out.println(myAcc.password);cant be accesed only can be changed becoz there is a function that gives access for public to change password
}
}
    class Pen{
        String color;
        int tip;
        void setColor(String newColor){
            color=newColor;
    }
        void setTip(int newTip){
            tip=newTip;
        }
    }
    class BankAccount{
        public String username;
        private String password;
        public void setPassword(String pwd){
            password=pwd;
        }
    }
