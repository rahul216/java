import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class prog34 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Porgrams and ide selection ");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Select programs "); 
        JCheckBox java = new JCheckBox("jAVA");
        JCheckBox c = new JCheckBox("C");
        JCheckBox python = new JCheckBox("python");
        JCheckBox cpp = new JCheckBox("C++");

        JLabel ide = new JLabel("select IDE");
        JCheckBox eclipse = new JCheckBox("Eclipse");
        JCheckBox netBeans = new JCheckBox("NetBeans");
        JCheckBox intellij = new JCheckBox("IntelliJ");
        JCheckBox visualStudio = new JCheckBox("Visual Studio");

        JButton submit = new JButton("SUBMIT "); 
        JTextArea output = new JTextArea(5 ,40);
        output.setEditable(false);

        // actionlistner on submit button 

        submit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                StringBuilder programs = new StringBuilder("Selectd programs are:");
                if(java.isSelected()){
                    programs.append(" Java\n");
                }
                if(c.isSelected()){
                    programs.append("C\n");
                }
                if(python.isSelected()){
                    programs.append("Python\n");
                }
                if(cpp.isSelected()){
                    programs.append("C++\n");
                }
                StringBuilder ides = new StringBuilder("the selected IDEs are \n");
                if(eclipse.isSelected()){
                    ides.append(" Eclipse\n");
                }
                if(netBeans.isSelected()){
                    ides.append("NetBeans\n");
                }
                if(intellij.isSelected()){
                    ides.append("IntelliJ\n");
                }
                if(visualStudio.isSelected()){
                    ides.append("Visual Studio\n");
                }
                output.setText(programs.toString() + ides.toString());
            }
        });
// adding everything on frame 
frame.add(label);
        frame.add(java);
        frame.add(c);
        frame.add(python);
        frame.add(cpp);
        frame.add(ide);
        frame.add(eclipse);
        frame.add(netBeans);
        frame.add(intellij);
        frame.add(visualStudio);
        frame.add(submit);
        frame.add(output);
        frame.setVisible(true);

    }
}
