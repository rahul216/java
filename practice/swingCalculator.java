import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class swingCalculator{
    public static void main(String[] args) {
        JFrame frame = new JFrame("My simple calculator");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5,2));
        // creating labels and textfields 
        JLabel label1 = new JLabel("enter your first number");
        JLabel label2 = new JLabel("enter your second number");
        JLabel result = new JLabel("result will be displayed here");
        JTextField text1 = new JTextField(60);
        JTextField text2  = new JTextField(60);

        // creating buttons 
        JButton add = new JButton("Add");
        JButton sub = new JButton("Subtract");
        JButton mul = new JButton("Multiply");
        JButton div = new JButton("Divide");

        // adding to frame 
        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(text2);
        frame.add(add);
        frame.add(sub);
        frame.add(mul);
        frame.add(div);
        frame.add(result);
        frame.setVisible(true);

        // adding action listener to buttons
        add.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double num1 = Double.parseDouble(text1.getText());
                double num2 = Double.parseDouble(text2.getText());
                double sum = num1 + num2;
                result.setText(String.valueOf(sum));
            }
        });

        sub.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double num1 = Double.parseDouble(text1.getText());
                double num2 = Double.parseDouble(text2.getText());
                double subtact = num1 - num2; 
                result.setText(String.valueOf(subtact));
            }
        });
        mul.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double num1 = Double.parseDouble(text1.getText());
                double num2 = Double.parseDouble(text2.getText());
                double multiply = num1 * num2;
                result.setText(String.valueOf(multiply));
            }
        });
        div.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double num1 = Double.parseDouble(text1.getText());
                double num2 = Double.parseDouble(text2.getText());
                if(num2!=0){
                    double divide = num1 / num2;
                    result.setText(String.valueOf(divide));
                }else{
                    result.setText("Error! Division by zero is not allowed");
                }
            }
        });
    
    }
}