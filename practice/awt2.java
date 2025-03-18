import java.awt.*;
import java.awt.event.*;

public class awt2 {
    public static void main(String[] args) {
        Frame frame = new Frame("My First AWT Application");
        frame.setSize(500, 500);
        frame.setLayout(null);

        // Adding a label in the frame
        Label label1 = new Label("This is my first AWT application and this is label 1 of that");
        label1.setBounds(10, 50, 400, 20);

        Label label2 = new Label("This is my second label of AWT application");
        label2.setBounds(10, 80, 400, 20);

        // Adding text field
        TextField textField = new TextField(40);
        textField.setBounds(10, 150, 200, 20);

        // Adding components to the frame
        frame.add(label1);
        frame.add(label2);
        frame.add(textField);

        // Window closing event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
