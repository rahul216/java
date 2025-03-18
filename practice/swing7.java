import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class swing7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Programs and IDE Selection");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create Menu Bar
        JMenuBar menuBar = new JMenuBar();

        // Programs Menu
        JMenu programMenu = new JMenu("Select Programs");
        JCheckBoxMenuItem java = new JCheckBoxMenuItem("Java");
        JCheckBoxMenuItem c = new JCheckBoxMenuItem("C");
        JCheckBoxMenuItem python = new JCheckBoxMenuItem("Python");
        JCheckBoxMenuItem cpp = new JCheckBoxMenuItem("C++");

        programMenu.add(java);
        programMenu.add(c);
        programMenu.add(python);
        programMenu.add(cpp);

        // IDEs Menu
        JMenu ideMenu = new JMenu("Select IDEs");
        JCheckBoxMenuItem eclipse = new JCheckBoxMenuItem("Eclipse");
        JCheckBoxMenuItem netBeans = new JCheckBoxMenuItem("NetBeans");
        JCheckBoxMenuItem intellij = new JCheckBoxMenuItem("IntelliJ");
        JCheckBoxMenuItem visualStudio = new JCheckBoxMenuItem("Visual Studio");

        ideMenu.add(eclipse);
        ideMenu.add(netBeans);
        ideMenu.add(intellij);
        ideMenu.add(visualStudio);

        // Add menus to menu bar
        menuBar.add(programMenu);
        menuBar.add(ideMenu);
        frame.setJMenuBar(menuBar);

        // Submit Button
        JButton submit = new JButton("SUBMIT");
        JTextArea output = new JTextArea(5, 40);
        output.setEditable(false);

        // Action Listener for submit button
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StringBuilder programs = new StringBuilder("Selected programs are:\n");
                if (java.isSelected()) programs.append("Java\n");
                if (c.isSelected()) programs.append("C\n");
                if (python.isSelected()) programs.append("Python\n");
                if (cpp.isSelected()) programs.append("C++\n");

                StringBuilder ides = new StringBuilder("The selected IDEs are:\n");
                if (eclipse.isSelected()) ides.append("Eclipse\n");
                if (netBeans.isSelected()) ides.append("NetBeans\n");
                if (intellij.isSelected()) ides.append("IntelliJ\n");
                if (visualStudio.isSelected()) ides.append("Visual Studio\n");

                output.setText(programs.toString() + ides.toString());
            }
        });

        // Adding components to frame
        frame.add(submit);
        frame.add(output);
        frame.setVisible(true);
    }
}
