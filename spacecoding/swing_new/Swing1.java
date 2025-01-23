import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing1{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Esempio 1");
        JLabel labelUserName = new JLabel("Enter Your Name");
        JTextField textFieldUserName = new JTextField();
        JButton button = new JButton("Premi");
        JButton buttonClear = new JButton("Cancella");
        textFieldUserName.setColumns(30);
        JPanel panel = new JPanel();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String userName = textFieldUserName.getText();
                labelUserName.setText("Ciao " + userName);
            }
        });
        
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                textFieldUserName.setText("");
            }
        });
        panel.setLayout(new GridLayout(2,2,15,15));
        panel.add(labelUserName);
        panel.add(textFieldUserName);
        panel.add(button);
        panel.add(buttonClear);
        frame.add(panel);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}