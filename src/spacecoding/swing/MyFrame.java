import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    JLabel jLabel=new JLabel("Buona lezione");

    public MyFrame(){
        //costruttore
        super("Prima finestra");
        //JFrame deriva da Container
        Container c=this.getContentPane();
        c.add(jLabel);
        //Metodi di JFrame
        this.setSize(200,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
