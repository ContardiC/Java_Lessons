import javax.swing.*;
import java.awt.*;

public class MenuFrame extends JFrame {
    JMenuBar bar=new JMenuBar();
    JMenu fileMnu=new JMenu("File");
    JMenu editMnu=new JMenu("Edit");
    JMenu moveMnu=new JMenu("Move");
    JMenuItem upItem=new JMenuItem("Up");
    public MenuFrame(){
            setJMenuBar(bar);
            bar.add(fileMnu);
            bar.add(editMnu);
            editMnu.add(moveMnu);
            editMnu.add(new JMenuItem("Random"));
            moveMnu.add(upItem);
            moveMnu.add(new JMenuItem("Down"));
            setSize(400,400);
            setVisible(true);
    }

}
