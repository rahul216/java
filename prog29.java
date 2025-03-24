// question 32 
import java.awt.*;
import java.awt.event.*;

public class prog29 extends Frame {
    @Override
    public void paint(Graphics g) {
        g.drawRect(50, 50, 100, 100);
        g.setColor(Color.red);
        g.fillOval(180, 50, 50, 50);
    }

    public static void main(String[] args) {
        prog29 d2 = new prog29();
        d2.setSize(300, 300);
        d2.setVisible(true);
        
        d2.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                d2.dispose();
            }
        });
    }
}
