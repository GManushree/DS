import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculate implements ActionListener{
    JFrame frame;
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1,b2,b3,b4,b5;
    Calculate()
    {
        frame=new JFrame("Simple Calculator");
        frame.setSize(500,400);
        frame.setVisible(true);
        frame.setLocation(100,100);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        l1=new JLabel("NUM1");
       // l1.setFont(newFont("Arial",Font.PLAIN,20));
        l1.setBounds(50,50,150,50);
        frame.add(l1);
        l2=new JLabel("NUM2");
        //l2.setFont(newFont("Arial",Font.PLAIN,20));
        l2.setBounds(50,100,150,50);
        frame.add(l2);
        l3=new JLabel("RESULT");
       // l3.setFont(newFont("Arial",Font.PLAIN,20));
        l3.setBounds(50,250,150,50);
        frame.add(l3);
        t1=new JTextField();
        t1.setBounds(150,110,200,40);
        frame.add(t1);
        t2=new JTextField();
        t2.setBounds(150,110,200,40);
        frame.add(t2);
        b1=new JButton("ADD");
        b1.setBounds(50,200,100,40);
        frame.add(b1);
        b1.addActionListener(this);
        b2=new JButton("sub");
        b2.setBounds(150,200,100,40);
        frame.add(b2);
        b2.addActionListener(this);
        b3=new JButton("MUL");
        b3.setBounds(250,200,100,40);
        frame.add(b3);
        b3.addActionListener(this);
        b4=new JButton("DIV");
        b4.setBounds(350,200,100,40);
        frame.add(b4);
        b4.addActionListener(this);
        b5=new JButton("CLR");
        b5.setBounds(200,300,100,40);
        frame.add(b5);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            int add=n1+n2;
            l3.setText("Result is"+add);
        }
         if(e.getSource()==b2)
        {
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            int sub=n1-n2;
            l3.setText("Result is"+sub);
        }
          if(e.getSource()==b3)
        {
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            int mul=n1*n2;
            l3.setText("Result is"+mul);
        }
           if(e.getSource()==b4)
        {
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            int div=n1/n2;
            l3.setText("Result is"+div);
        }
           if(e.getSource()==b5)
           {
               t1.setText("");
               t2.setText("");
           }
}
}
    
public class SimpleCalculator{
    public static void main(String[] args)
    {
         Calculate c=new Calculate();
    }
}