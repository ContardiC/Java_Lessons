import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class LoginForm{
    public static void addComponentsToPanel(JPanel panel){
        JLabel labelUser = new JLabel("User");
        JTextField textUser = new JTextField();
        JLabel labelPassword = new JLabel("Password");
        JPasswordField textPassword = new JPasswordField();
        // Buttons
        JButton buttonCancel = new JButton("Cancel");
        JButton buttonLogin = new JButton("Login");
        // Adding components to panel
        panel.add(labelUser);
        panel.add(labelPassword);
        panel.add(textUser);
        panel.add(textPassword);
        panel.add(buttonCancel);
        panel.add(buttonLogin);
    }
    public static checkData(String username, String password){
        // TODO: add data checking
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        JPanel panel = new JPanel(new GridLayout(3,2,15,15));
        
        addComponentsToPanel(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the frame to the center of the screen
        frame.setLocationRelativeTo(null);
        frame.setSize(500,250);

        //  Add the components to the frame
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}