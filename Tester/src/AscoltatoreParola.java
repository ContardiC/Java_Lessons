import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AscoltatoreParola implements ActionListener {
    String parola;
    JLabel lblParola = new JLabel();
    File file = new File("C:\\Users\\studente.DIDATTICA\\IdeaProjects\\VerificaPratica\\src");

    public AscoltatoreParola(JLabel lblParola ){
        this.lblParola = lblParola;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String parola = e.getActionCommand();
        try{
            FileReader fr = new FileReader(file);
            BufferedReader b = new BufferedReader(fr);
            try{
                parola = b.readLine();
                lblParola.setText(parola);
                lblParola.setText("fatto!");
            }catch(IOException err){
                System.out.println("Errore: " +err.getMessage());
            }

        }catch(Exception err){
            System.out.println("Errore: " +err.getMessage());
        }
    }




}

