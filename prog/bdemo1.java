//Q36
import java.awt.*;
import java.awt.event.*;
public abstract class bdemo1 extends Frame implements ActionListener {
    Button b1,b2,b3,b4;
    TextField t1,t2,t3;
    public bdemo1(){
        Label l1 = new Label("Enter a number ");
        Label l2= new Label("Enter another no");
        Label l3=new Label("Answer");
        t1=new TextField(20);
        t2=new TextField(20);
        t3=new TextField(20);
        b1=new Button("Add");
        b2=new Button("Sub");
        b3=new Button("Multiply");
        b4=new Button("Divide"); 
    setLayout(new FlowLayout());
         add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(b1);add(b2);add(b3);add(b4);
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
         b4.addActionListener(this);
    }
public void actionPerformed(ActionEvent e){
    String s1,s2,s3;
    s1=t1.getText();
    s2=t2.getText();
    s3=t3.getText();
    int a,b,c;
    a=Integer.parseInt(s1);
    b=Integer.parseInt(s2);
    c=Integer.parseInt(s3);
    if (e.getSource()==b1)
        c=a+b;
    else if(e.getSource()==b2)
        c=a-b;
    else if (e.getSource()==b3)
       c=a*b;
    else if (e.getSource()==b4)
        c=a/b;
    s3 = String.valueOf(c);
    t3.setText(s3);
    
}
public static void main(String[] args) {
       bdemo1 d5;
        d5 = new bdemo1() {};
        d5.setSize(200,300);
        d5.setVisible(true);
    }}