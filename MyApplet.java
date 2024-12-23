import java.applet.Applet;
import java.awt.*;
public class MyApplet extends Applet {

    
    public void init() {
        setBackground(Color.BLACK);
        setForeground(Color.ORANGE);
    }
   public void paint(Graphics g)
   {
       g.drawString("HI THIS IS MY FIRST APPLET", 50, 100);
   }
}
