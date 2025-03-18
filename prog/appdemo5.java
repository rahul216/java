
//Q34
import java.awt.*;
import java.awt.event.*;

public class appdemo5 extends Frame {
  public appdemo5() {
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        dispose();
      }
    });

    Label l1 = new Label("Input Name");
    Label l2 = new Label("Input Program");
    TextField t1 = new TextField(15);
    TextField t2 = new TextField(15);
    Button b1 = new Button("OK");
    setLayout(new FlowLayout());
    add(l1);
    add(l2);
    add(b1);
    add(t1);
    add(t2);
  }

  public static void main(String[] args) {
    appdemo5 d1 = new appdemo5();
    d1.setSize(200, 200);
    d1.setVisible(true);
  }

}
