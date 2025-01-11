import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkData(textUser.getText(), textPassword.getText())){
                    JOptionPane.showMessageDialog(panel, "Hello " + textUser.getText(), "Login Message", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(panel, "Wrong Credentials","Login message",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textUser.setText("");
                textPassword.setText("");
            }
        });
    }
    public static boolean checkData(String username, String password){
        if(username.equals("java") && password.equals("secret")){
            return true;
        }
        return false;
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