import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GestoreEventiComboBox implements ItemListener {
    private JLabel statusLabel;

    public GestoreEventiComboBox(JLabel statusLabel) {
        this.statusLabel = statusLabel;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            Object selectedItem = e.getItem();
            statusLabel.setText("Selezione: " + selectedItem.toString());
        }
    }
}