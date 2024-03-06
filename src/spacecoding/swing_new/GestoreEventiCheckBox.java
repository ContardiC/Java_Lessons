import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class GestoreEventiCheckBox implements ItemListener {
    private JLabel statusLabel;

    public GestoreEventiCheckBox(JLabel statusLabel) {
        this.statusLabel = statusLabel;
    }

    public void itemStateChanged(ItemEvent e) {
        JCheckBox checkBox = (JCheckBox) e.getItem();
        String sport = checkBox.getText();
        String stato = (e.getStateChange() == 1) ? "selezionato" : "non selezionato";
        statusLabel.setText("Checkbox " + sport + ": " + stato);
    }
}