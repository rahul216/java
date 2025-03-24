//Q35
import java.awt.*;
import java.awt.event.*;

public class prog32 extends Frame implements ActionListener {
    Button b1;
    TextField t1, t2;

    public prog32() {
        Label l1 = new Label("Enter text");
        Label l2 = new Label("Answer");
        t1 = new TextField(20);
        t2 = new TextField(20);
        b1 = new Button("OK");

        setLayout(new FlowLayout());
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);

        // Add action listener to button
        b1.addActionListener(this);

        // Add window closing functionality
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = t1.getText();
        t2.setText(s1); // Display text from t1 into t2
    }

    public static void main(String[] args) {
        prog32 d = new prog32();
        d.setSize(300, 200);
        d.setTitle("Text Transfer");
        d.setVisible(true);
    }
}
