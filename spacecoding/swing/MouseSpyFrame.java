import javax.swing.*;

public class MouseSpyFrame extends JFrame {
    public MouseSpyFrame(){
        super("MouseTest");
        this.addMouseListener(new MouseSpy());
        setSize(500,500);
        setVisible(true);
    }
}
