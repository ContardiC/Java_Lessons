import java.awt.*;

import javax.swing.*;

public class EsempioJCheckBox {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public EsempioJCheckBox() {
        prepareGUI();
    }

    public static void main(String[] args) {
        EsempioJCheckBox demo = new EsempioJCheckBox();
        demo.mostraDemoCheckBox();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Esempio Java Swing - JCheckBox");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void mostraDemoCheckBox() {
        headerLabel.setText("Sport Preferiti");

        final JCheckBox checkBoxCalcio = new JCheckBox("Calcio");
        final JCheckBox checkBoxTennis = new JCheckBox("Tennis");
        final JCheckBox checkBoxRugby = new JCheckBox("Rugby");
        final JCheckBox checkBoxCricket = new JCheckBox("Cricket");
        final JCheckBox checkBoxCorsa = new JCheckBox("Corsa");

        GestoreEventiCheckBox gestoreEventi = new GestoreEventiCheckBox(statusLabel);

        checkBoxCalcio.addItemListener(gestoreEventi);
        checkBoxTennis.addItemListener(gestoreEventi);
        checkBoxRugby.addItemListener(gestoreEventi);
        checkBoxCricket.addItemListener(gestoreEventi);
        checkBoxCorsa.addItemListener(gestoreEventi);

        controlPanel.add(checkBoxCalcio);
        controlPanel.add(checkBoxTennis);
        controlPanel.add(checkBoxRugby);
        controlPanel.add(checkBoxCricket);
        controlPanel.add(checkBoxCorsa);
    }
}