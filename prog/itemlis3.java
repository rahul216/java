
import java.awt.*;
import java.awt.event.*;
public class itemlis3 extends Frame implements ItemListener {
    List li;
    Choice ch;
    Label l1,l2;
    itemlis3(){
      
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
});
        li=new List(4,true);
        li.add("prog1");
        li.add("prog2");
        li.add("prog3");
        li.add("prog4");
        li.add("prog5");
        
        ch=new Choice();
        ch.add("blue");
        ch.add("netbeans");
        ch.add("gel");
        
       l1=new Label("Program List");
        l2=new Label("Select IDE");
        setLayout(new FlowLayout());
        add(l1);add(li);add(l2);add(ch);}
        public void itemStateChanged(ItemEvent e){
            repaint();
        }
        public void paint(Graphics g) {
            StringBuilder selectedPrograms = new StringBuilder();
        String[] items = li.getSelectedItems();
        for (String item : items) {
            selectedPrograms.append(item).append(", ");
        }

        // Remove trailing comma
        if (selectedPrograms.length() > 0) {
            selectedPrograms.setLength(selectedPrograms.length() - 2);
        }

        String selectedIDE = ch.getSelectedItem();

        g.drawString("My programs are: " + selectedPrograms.toString(), 50, 200);
        g.drawString("Selected IDE is: " + selectedIDE, 50, 220);
    }
     public static void main(String[] args) {
        itemlis3 i = new itemlis3();
        i.setSize(300,300);
        i.setVisible(true);
    }}
   
    

