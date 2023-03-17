import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    JPanel nordPnl=new JPanel();
    JPanel centroPnl=new JPanel();
    JPanel sudPnl=new JPanel();

    JLabel infoLbl=new JLabel("Selezionare");
    JCheckBox opz1Chk=new JCheckBox("Opz 1");
    JCheckBox opz2Chk=new JCheckBox("Opz 2");
    JButton okBtn=new JButton("OK");
    JButton cancBtn=new JButton("Annulla");

    public GUI(){
        super("Esempio GUI");
        centroPnl.setLayout(new GridLayout(2,1));
        centroPnl.add(opz1Chk);
        centroPnl.add(opz2Chk);
        sudPnl.setLayout(new FlowLayout());
        sudPnl.add(okBtn);
        sudPnl.add(cancBtn);
        nordPnl.setLayout(new FlowLayout());
        nordPnl.add(infoLbl);
        getContentPane().add(nordPnl,BorderLayout.NORTH);
        getContentPane().add(centroPnl,BorderLayout.CENTER);
        getContentPane().add(sudPnl,BorderLayout.SOUTH);
        /*
        La dimensione è impostata come la minima necessaria
        per visualizzare tutti i controlli
         */
        pack();
        // Recuperiamo le dimensioni dello schermo
        Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
        // Spostiamo la finestra aò centro dello schermo con il metodo setLocation(int x, int y)
        // dove x,y sono le coordinate nell'angolo in alto a sinistra
        setLocation((int)(dim.getWidth()-this.getWidth())/2,(int)(dim.getHeight()-this.getHeight())/2);

        setVisible(true);

    }
}
