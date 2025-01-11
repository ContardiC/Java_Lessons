import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingExample{
    public static void main(String[] args) {
        JFrame frameMain = new JFrame("GUI Application");
        frameMain.setSize(400,500);
        JLabel label = new JLabel("Hello");
        JTextField textField = new JTextField(25);
        
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");

        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");

        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(label);
        panel.add(textField);
        frameMain.add(panel);
        frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameMain.show();
    }
}