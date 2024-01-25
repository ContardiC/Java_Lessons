import javax.swing.*;
import java.awt.*;

public class MyFrame2 {
    JFrame jFrame;
    JLabel jLabel;
    
    public MyFrame2(){
        jFrame = new JFrame("Prima finestra v2");
        jLabel = new JLabel("Etichettina");
        //JFrame deriva da Container
        Container c=jFrame.getContentPane();
        c.add(jLabel);
        //Metodi di JFrame
        jFrame.setSize(200,200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
