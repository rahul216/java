//Q33
import java.awt.*;
import java.awt.event.*;

public class appdemo4 extends Frame {
    public appdemo4() {
        setBackground(Color.gray); // Set background color to gray

        // Add window closing functionality
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); // Close the window when cross button is clicked
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        int x[] = {150, 50, 250}; // X-coordinates of the triangle
        int y[] = {50, 200, 200}; // Y-coordinates of the triangle
        int numPoints = x.length;

        g.setColor(Color.red); // Set triangle color to red
        g.fillPolygon(x, y, numPoints); // Draw a filled red triangle
    }

    public static void main(String[] args) {
        appdemo4 a1 = new appdemo4();
        a1.setSize(300, 300);
        a1.setTitle("Triangle Drawing");
        a1.setVisible(true);
    }
}
