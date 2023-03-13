import javax.swing.*;
import java.awt.*;

public class WordSearchGUI extends JFrame {
    AlphabetKeyboard alphabetKeyboard;

    public WordSearchGUI(){
        super("WordSearchAPP");
        setLayout(new BorderLayout());
        alphabetKeyboard=new AlphabetKeyboard();
        add(alphabetKeyboard,BorderLayout.CENTER);
        setSize(800,600);
        setVisible(true);
    }


}
