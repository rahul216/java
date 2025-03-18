import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class swing5 extends JFrame {
    private int x = -10; 
    private int y = -10;
    public swing5(){
        setTitle("click to draw circles ");
        setSize(700,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // adding mouselistener to detect clicks 

        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e ){
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });

    }
    public void paint(Graphics g){
        super.paint(g);  // clear the previous drawings 
        g.setColor(Color.red);
        g.fillOval(x-5,y-5, 10,10);
    }
    public static void main(String[] args) {
        new swing5();
    }
}
