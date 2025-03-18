import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class swing4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        

        // creating a label 
        JLabel label = new JLabel("this is example text");
        label.setFont(new Font("Arial", Font.BOLD,25));
        // adding mouselistener event to it 
        label.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent e){
                label.setText("this the text after mouse clicked ");
            }
            public void mousePressed(MouseEvent e){};

            public void mouseReleased(MouseEvent e){};
            public void mouseEntered(MouseEvent e ){
                label.setForeground(Color.RED);
            };
            public void mouseExited(MouseEvent e ){
                label.setForeground(Color.green);
            };
        });
        frame.add(label);
    frame.setVisible(true);
    }
}
