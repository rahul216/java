//Q-37

import java.awt.*;
import java.awt.event.*;
public class frame4 extends Frame implements ActionListener{
   Label l1,l2;
   TextField t1,t2;
   Button b1,b2;
   frame4(){
       l1=new Label("number");
       l2=new Label("square");
       t1=new TextField(20);
       t2=new TextField(20);
       b1=new Button("OK");
       b2= new Button("Clear");
       setLayout(new FlowLayout());
       add(l1);add(t1);add(l2);add(t2);add(b1);add(b2);
       b1.addActionListener(this);
       b2.addActionListener(this);
       
   }
   public void actionPerformed(ActionEvent e){
       String s1,s2;
       if (e.getSource()==b1){
       s1=t1.getText();
       int a = Integer.parseInt(s1);
       int n= a*a;
       s2=String.valueOf(n);
       t2.setText(s2);
       
   }
       else if (e.getSource()==b2){
           t2.setText("");
           t1.setText("");
       }
   
}
    public static void main(String[] args) {
       frame4 y1=new frame4();
       y1.setSize(300,300);
       y1.setVisible(true);
    }}
   
