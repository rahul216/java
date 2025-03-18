//Q38

import java.awt.*;
import java.awt.event.*;
public class frame5 extends Frame implements ItemListener{
    Checkbox c1,c2,c3,r1,r2,r3;
    Label l1,l2;
    CheckboxGroup cg;
    frame5(){
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
});
        c1=new Checkbox("Butter Naan");
        c2=new Checkbox("Kadhai Paneer");
        c3=new Checkbox("chole");
       cg=new CheckboxGroup();
        r1=new Checkbox("cash",cg,true);
        r2=new Checkbox("credit card",cg,true);
        r3=new Checkbox("debit card",cg,true);
        l1=new Label("Main courses");
        l2=new Label("mode of payment");
        setLayout(new FlowLayout());
        add(l1);add(c1);add(c2);add(c3);add(l2);add(r1);add(r2);add(r3);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        r1.addItemListener(this);
        r2.addItemListener(this);
        r3.addItemListener(this);
    }public void itemStateChanged(ItemEvent e){
        repaint();
    }
    public void paint(Graphics g){
        g.drawString("Selected: " + (c1.getState() ? "Butter Naan" : ""), 50, 200);
        g.drawString("selected "+(c2.getState()? "Kadhai Paneer":""),50,220);
        g.drawString("selected "+(c3.getState()? "chole":""), 50, 240);
        g.drawString("selected mode of payment"+cg.getSelectedCheckbox().getLabel(), 50, 260);
    }
    public static void main(String[] args) {
        frame5 n=new frame5();
        n.setSize(300,300);
        n.setVisible(true);
    }
}
