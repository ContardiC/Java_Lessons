package spacecoding.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBoxGUI extends JFrame implements ItemListener {

    private JComboBox<String> comboBox;
    private JLabel lbl_message;
    private String[] s;

    public ComboBoxGUI(String[] s){
        super("Esempio ComboBox");
        this.s=s;

        this.setLayout(new BorderLayout());

        comboBox=new JComboBox<>(s);
        lbl_message=new JLabel(" ");

        comboBox.addItemListener(this);

        this.add(comboBox, BorderLayout.NORTH);
        this.add(lbl_message,BorderLayout.SOUTH);

        this.setSize(600,400);
        this.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == this.comboBox) {

            this.lbl_message.setText(this.comboBox.getSelectedItem() + " selezionato");
        }
    }









}
