import javax.swing.*;
import java.awt.*;
import java.io.File;

public class GUI extends Frame {
    JFrame frame = new JFrame();
    JButton btnScrivi;
    JPanel pnlScrivi;
    JButton btnLettere[] = new JButton[26];
    JPanel pnlLettere;
    JPanel pnlParola;
    JTextArea txtParola;
    JLabel lblTxtParola;

    public GUI(){
        frame = new JFrame();
        frame.setLayout(new GridLayout( 2,1));

        pnlParola = new JPanel();
        txtParola = new JTextArea();
        lblTxtParola = new JLabel("Parola: ");

        lblTxtParola.add(txtParola);
        pnlParola.add(lblTxtParola);

        pnlLettere = new JPanel();
        pnlLettere.setLayout(new GridLayout(6, 5));
        btnLettere[0] = new JButton("a");
        btnLettere[1] = new JButton("b");
        btnLettere[2] = new JButton("c");
        btnLettere[3] = new JButton("d");
        btnLettere[4] = new JButton("e");
        btnLettere[5] = new JButton("f");
        btnLettere[6] = new JButton("g");
        btnLettere[7] = new JButton("h");
        btnLettere[8] = new JButton("i");
        btnLettere[9] = new JButton("j");
        btnLettere[10] = new JButton("k");
        btnLettere[11] = new JButton("m");
        btnLettere[12] = new JButton("n");
        btnLettere[13] = new JButton("l");
        btnLettere[14] = new JButton("o");
        btnLettere[15] = new JButton("p");
        btnLettere[16] = new JButton("q");
        btnLettere[17] = new JButton("r");
        btnLettere[18] = new JButton("s");
        btnLettere[19] = new JButton("t");
        btnLettere[20] = new JButton("u");
        btnLettere[21] = new JButton("v");
        btnLettere[22] = new JButton("w");
        btnLettere[23] = new JButton("x");
        btnLettere[24] = new JButton("y");
        btnLettere[25] = new JButton("z");

        for(int i=0; i<btnLettere.length; i++){
            pnlLettere.add(btnLettere[i]);
            btnLettere[i].addActionListener(new AscoltatoreLettere(lblTxtParola));
        }

        pnlScrivi= new JPanel();
        btnScrivi = new JButton("SCRVI PAROLA!");
        btnScrivi.addActionListener(new AscoltatoreParola(lblTxtParola));
        pnlScrivi.add(btnScrivi);

        JPanel pnlCompleto = new JPanel();
        pnlCompleto.setLayout(new GridLayout(1,2));
        pnlCompleto.add(pnlLettere);
        pnlCompleto.add(pnlScrivi);

        frame.add(pnlParola);
        frame.add(pnlCompleto);
        Dimension dm = new Dimension(600, 400);
        frame.setSize(dm);
        frame.setVisible(true);

    }
}
