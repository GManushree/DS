public class GettersAndSetters {
    public static void main(String[] args) {
        Pens p1=new Pens();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
}
}
    class Pens{
        private String color;
        private int tip;
        String getColor(){
            return this.color;
        }
        int getTip(){
            return this.tip;
        }
        void setColor(String newColor){
            this.color=newColor;
        }
        void setTip(int tip){
            this.tip=tip;
        }
    }

