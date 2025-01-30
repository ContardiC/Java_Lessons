package spacecoding.swing;

// Java program to show JRadioButton Example.
// in java. Importing different Package.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.Serial;

class RadioButtonGUI extends JFrame {

    // Declaration of object of JRadioButton class.
    JRadioButton jRadioButton1;

    // Declaration of object of JRadioButton class.
    JRadioButton jRadioButton2;

    // Declaration of object of JButton class.
    JButton jButton;
   
    // Declaration of object of ButtonGroup class.
    ButtonGroup buttonGroup;

    // Declaration of object of JLabel class.
    JLabel L1;

    // Constructor of Demo class.
    public RadioButtonGUI()
    {
        
        // Setting layout as null of JFrame.
        this.setLayout(new FlowLayout());

        // Initialization of object of "JRadioButton" class.
        jRadioButton1 = new JRadioButton();

        // Initialization of object of "JRadioButton" class.
        jRadioButton2 = new JRadioButton();

        // Initialization of object of "JButton" class.
        jButton = new JButton("Click");

        // Initialization of object of "ButtonGroup" class.
        buttonGroup = new ButtonGroup();

        // Initialization of object of " JLabel" class.
        L1 = new JLabel("Gioco preferito");

        // setText(...) function is used to set text of radio button.
        // Setting text of "jRadioButton2".
        jRadioButton1.setText("League of Legends");

        // Setting text of "jRadioButton4".
        jRadioButton2.setText("Valorant");

        this.add(jRadioButton1);

        // Adding "jRadioButton4" on JFrame.
        this.add(jRadioButton2);

        // Adding "jButton" on JFrame.
        this.add(jButton);

        // Adding JLabel "L2" on JFrame.
        this.add(L1);

        // Adding "jRadioButton1" and "jRadioButton3" in a Button Group "G2".
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);

        // Adding Listener to JButton.
        jButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e)
            {
                

                // Declaration of String class Objects.
                String prefGame = " ";

                // If condition to check if jRadioButton2 is selected.
                if (jRadioButton1.isSelected()) {

                    // prefGame = "League of Legends";
                    prefGame = jRadioButton1.getText();
                }
                else if (jRadioButton2.isSelected()) {

                    prefGame = "Valorant";
                }
                else {

                    prefGame = "Nessuna scelta effettuata";
                }
                // MessageDialog to show information selected radio buttons.
                JOptionPane.showMessageDialog(RadioButtonGUI.this, prefGame);
            }
        });
    }
}


