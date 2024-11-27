import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ascoltatore implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b=(JButton)e.getSource();
        JOptionPane.showMessageDialog(null,
                "E' stato premuto :"+b.getText());
    }
}
