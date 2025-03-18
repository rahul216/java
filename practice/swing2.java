import javax.swing.*;
import java.awt.*;

public class swing2 extends JFrame {

    public swing2() {
        setTitle("Shapes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);

        // Draw Rectangle (Red) - Adjusted position
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 50);  

        // Draw Square (Green) - Adjusted position
        g.setColor(Color.GREEN);
        g.fillOval(200, 50, 50, 50);  

        // Draw Triangle (Blue) - Adjusted position
        g.setColor(Color.BLUE);
        int[] x = {300, 350, 250};  
        int[] y = {80, 150, 150};   
        g.fillPolygon(x, y, 3);

        // Draw Trapezium (Magenta) - Adjusted position
        g.setColor(Color.MAGENTA);
        int[] a = {50, 150, 200, 20};  
        int[] b = {200, 200, 250, 250};   
        g.fillPolygon(a, b, 4);
    }

    public static void main(String[] args) {
        new swing2();
    }
}
