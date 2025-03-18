import javax.swing.*;

public class swing1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My first swing application"); 
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        // adding a label in the frame 
        JLabel label1 = new JLabel("This my first swing application and this is label 1 of that");
        label1.setBounds(10,50,400,400);

        JLabel label2 = new JLabel("This is my second label of swing application");
        label2.setBounds(10,80,400,400);

        // adding text field 
        JTextField textfield = new JTextField(40); 
        textfield.setBounds(10,90,200,20);
        // adding to the frame 
        frame.add(label1);
        frame.add(label2);
        frame.add(textfield);

    
        frame.setVisible(true);
    }
}
