import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AscoltatoreLettere implements ActionListener {
    JLabel lblBtnLettera = new JLabel();
    File file= new File("file.txt");;

    public AscoltatoreLettere(JLabel lblBtnLettera){
        this.lblBtnLettera = lblBtnLettera;
    }

    public void actionPerformed(ActionEvent e){
        String letteraBtn = e.getActionCommand();
        String lettere[] = new String[1000];
        char lettereParola[] = new char[1000];

        if(lblBtnLettera.getText()== ""){
            lblBtnLettera.setText(letteraBtn);
        }else{
            lblBtnLettera.setText(lblBtnLettera.getText()+letteraBtn);
        }

        for(int i=0; i<1000; i++){
            lettere[i] = letteraBtn;
            lettereParola = lettere[i].toCharArray();
        }

        String parolaINString = lettereParola.toString();
        FileWriter f;
        PrintWriter fOUT = null;

        try{
            f=new FileWriter(file);
            fOUT = new PrintWriter(f);
            try{
                fOUT.println(parolaINString);
                fOUT.flush();
            }catch(Exception err){
                System.out.println("ERRORE: " +err.getMessage());
            }
        }catch(Exception err){
            System.out.println("Errore: " +err.getMessage());
        }


    }

}

