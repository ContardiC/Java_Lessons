import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlphabetKeyboard extends JPanel {
    private JButton[] keys;
    private String alphabet;

    public AlphabetKeyboard(){
        super();
        alphabet="abcdefghilmnopqrstuvz";
        keys= new JButton[26];
        this.setLayout(new GridLayout(3,7));
        for(int i=0;i<21;i++){
            keys[i]=new JButton(" "+ alphabet.charAt(i));
            this.add(keys[i]);
            keys[i].addActionListener(new AlphabetKeyboardListener());
        }
    }
}
