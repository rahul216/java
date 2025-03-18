// q 31 
import java.awt.*;
import java.awt.event.*;

public class appdemo extends Frame {
    @Override
    public void paint(Graphics g) {
        g.drawString("My First applet program", 50, 100);
        g.drawLine(50, 110, 150, 110);
    }

    public static void main(String[] args) {
        appdemo d1 = new appdemo();
        d1.setSize(300, 300);
        d1.setVisible(true);
        
        // Close window on clicking the cross button
        d1.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                d1.dispose();
            }
        });
    }
}
