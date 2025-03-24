//Q37
import java.awt.*;
import java.awt.event.*;
public class bdemo2 extends Frame implements ActionListener {
    Button b1,b2;
    TextField t1,t2;
    public bdemo2(){
        Label l1 = new Label("NUMBER");
        Label l2= new Label("Square");
        t1=new TextField(20);
        t2=new TextField(20);
        b1=new Button("ok");
        b2=new Button("clear");
    setLayout(new FlowLayout());
         add(l1);add(t1);add(l2);add(t2);add(b1);add(b2);
         b1.addActionListener(this);
         b2.addActionListener(this);
    }
public void actionPerformed(ActionEvent e){
    if(e.getSource()==b1){
        String s1=t1.getText();
        int a1=Integer.parseInt(s1);
        int n=a1*a1;
        String s2=String.valueOf(n);
    }
    else if (e.getSource()==b2){
        t1.setText("Tannu");
        t2.setText("Priya");
    }}
public static void main(String[] args) {
       bdemo2 d7;
        d7 = new bdemo2() {};
        d7.setSize(200,300);
        d7.setVisible(true);
    }
}
