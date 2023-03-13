import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlphabetKeyboardListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }
}
