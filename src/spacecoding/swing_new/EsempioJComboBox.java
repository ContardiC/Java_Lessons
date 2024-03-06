import java.awt.*;

import javax.swing.*;

public class EsempioJComboBox {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public EsempioJComboBox() {
        prepareGUI();
    }

    public static void main(String[] args) {
        EsempioJComboBox demo = new EsempioJComboBox();
        demo.mostraDemoComboBox();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Esempio Java Swing - JComboBox");
        mainFrame.setSize(600, 400);
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

    private void mostraDemoComboBox() {
        headerLabel.setText("Seleziona un colore:");

        String[] colori = {"Rosso", "Verde", "Blu", "Giallo", "Arancione"};
        JComboBox<String> comboBoxColori = new JComboBox<>(colori);

        GestoreEventiComboBox gestoreEventi = new GestoreEventiComboBox(statusLabel);
        comboBoxColori.addItemListener(gestoreEventi);

        controlPanel.add(comboBoxColori);
    }
}