import javax.swing.*;
import java.awt.*;

public class AscoltatoreFrame extends JFrame {
    JButton uno=new JButton("Uno");
    JButton due=new JButton("Due");
    JButton tre=new JButton("Tre");
    // ActionListener
    Ascoltatore listener=new Ascoltatore();
    public AscoltatoreFrame(){
        super("AscoltatoreFrame");
        Container c=this.getContentPane();
        c.setLayout(new FlowLayout());
        c.add(uno);
        uno.addActionListener(listener);
        c.add(due);
        due.addActionListener(listener);
        c.add(tre);
        tre.addActionListener(listener);
        setSize(400,400);
        setVisible(true);
    }
}
