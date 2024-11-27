import javax.swing.*;
import java.awt.*;

public class GridLayoutFrame extends JFrame {
   public GridLayoutFrame(){
       super("Grid Layout");
       Container c=this.getContentPane();
       c.setLayout(new GridLayout(4,4));
       // inserisco i JButton
       for(int i=0;i<16;i++){
           c.add(new JButton(String.valueOf(i+1)));
       }
       this.setSize(300,300);
       this.setVisible(true);
   }

}
