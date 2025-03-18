

import java.awt.*;
import java.awt.event.*;
public class itemlis extends Frame implements ItemListener{
    Label l1,l2,l3;
    TextField t1;
    Checkbox c1,c2,c3,c4,r1,r2;
    CheckboxGroup cg;
    String hobbies;
    itemlis(){
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
});
      l1=new Label("Enter name");
      l2=new Label("Select Hobbies");
      l3=new Label("Select Gender");
      c1=new Checkbox("Travelling");
      c2=new Checkbox("Reading");
      c3=new Checkbox("Singing");
      c4=new Checkbox("Dancing");
      cg=new CheckboxGroup();
      r1=new Checkbox("Male",cg,true);
      r2=new Checkbox("FEmale",cg,true);
      t1=new TextField(20);
      setLayout(new FlowLayout());
      add(l1);add(t1);add(l2);add(c1);add(c2);add(c3);add(c4);add(l3);add(r1);add(r2);
      c1.addItemListener(this);
      c2.addItemListener(this);
      c3.addItemListener(this);
      c4.addItemListener(this);
      r1.addItemListener(this);
      r2.addItemListener(this);}
    @Override
      public void itemStateChanged(ItemEvent e){
           hobbies = "";
        if (c1.getState()) hobbies += "Travelling, ";
        if (c2.getState()) hobbies += "Reading, ";
        if (c3.getState()) hobbies += "Singing, ";
        if (c4.getState()) hobbies += "Dancing, ";

        // Remove the last comma if hobbies are present
        if (!hobbies.isEmpty()) {
            hobbies = hobbies.substring(0, hobbies.length() - 2);
        }

        String genderPrefix = r1.getState() ? "Mr." : "Mrs.";
        String name = t1.getText().trim();
      }
      public static void main(String[] args) {
        
    
      itemlis i3=new itemlis();
      i3.setSize(300,300);
      i3.setVisible(true);
              }
}
    
    
    
