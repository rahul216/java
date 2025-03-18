import java.awt.*;
import java.awt.event.*;

public class awt1 {
    public static void main(String[] args) {
        Frame frame = new Frame("Programs and IDE Selection");
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());

        Label label = new Label("Select programs:");
        Checkbox java = new Checkbox("Java");
        Checkbox c = new Checkbox("C");
        Checkbox python = new Checkbox("Python");
        Checkbox cpp = new Checkbox("C++");

        Label ideLabel = new Label("Select IDE:");
        Checkbox eclipse = new Checkbox("Eclipse");
        Checkbox netBeans = new Checkbox("NetBeans");
        Checkbox intellij = new Checkbox("IntelliJ");
        Checkbox visualStudio = new Checkbox("Visual Studio");

        Button submit = new Button("SUBMIT");
        TextArea output = new TextArea(5, 40);
        output.setEditable(false);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StringBuilder programs = new StringBuilder("Selected programs are:\n");
                if (java.getState()) {
                    programs.append("Java\n");
                }
                if (c.getState()) {
                    programs.append("C\n");
                }
                if (python.getState()) {
                    programs.append("Python\n");
                }
                if (cpp.getState()) {
                    programs.append("C++\n");
                }

                StringBuilder ides = new StringBuilder("The selected IDEs are:\n");
                if (eclipse.getState()) {
                    ides.append("Eclipse\n");
                }
                if (netBeans.getState()) {
                    ides.append("NetBeans\n");
                }
                if (intellij.getState()) {
                    ides.append("IntelliJ\n");
                }
                if (visualStudio.getState()) {
                    ides.append("Visual Studio\n");
                }

                output.setText(programs.toString() + ides.toString());
            }
        });

        frame.add(label);
        frame.add(java);
        frame.add(c);
        frame.add(python);
        frame.add(cpp);
        frame.add(ideLabel);
        frame.add(eclipse);
        frame.add(netBeans);
        frame.add(intellij);
        frame.add(visualStudio);
        frame.add(submit);
        frame.add(output);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
