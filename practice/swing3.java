import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class swing3 {
    public static void main(String[] args) {
        // creating the main frame 

    JFrame frame = new JFrame();
    frame.setSize(600,600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());

    // creating components 
    JLabel label1 = new JLabel("enter your name ");

    JTextField textfield = new JTextField(40);
    JButton button = new JButton("submit");

    JTextArea textarea = new JTextArea(5,30);
    textarea.setEditable(false);

    // adding components to frame 
    frame.add(label1);
    frame.add(textfield);
    frame.add(button);

    frame.add(textarea);

    // defining the function of button 
    button.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            String name = textfield.getText().trim();
            if(!name.isEmpty()){
                textarea.setText("Hello, "+ name + " welcome to my swing application");
            }else{
                textarea.setText("please enter your name ");
            }
        }
    });

frame.setVisible(true);
    }
}
