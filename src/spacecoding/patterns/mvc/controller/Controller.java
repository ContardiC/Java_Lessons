package spacecoding.patterns.mvc.controller;

import spacecoding.patterns.mvc.view.NoteWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Controller implements ActionListener {
    private NoteWindow noteWindow;
    private JDialog dialog;
    private String noteTitle;
    private String noteBody;
    private File notes;
    private FileWriter fileWriter;
    public Controller(NoteWindow noteWindow){
        this.noteWindow=noteWindow;
        this.noteWindow.getBtnSaveNote().addActionListener(this);
        notes=new File("notes.csv");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==noteWindow.getBtnSaveNote()){
            JLabel lblDialog=new JLabel("La nota è vuota non può essere salvata");
            System.out.println("Save Button clicked");
            if(noteWindow.getTxtNote().getText().equals("")){
                System.out.println("Nota vuota");
                JOptionPane.showMessageDialog(noteWindow.getFrm(),"La nota è vuota");
            }else{
                if(noteWindow.getTxtTitle().getText().length() == 0 || noteWindow.getTxtTitle().equals("")){
                    noteTitle="Senza Nome"+";";
                }
                noteBody=noteWindow.getTxtNote().getText();
                try {
                    try {
                        fileWriter=new FileWriter(notes,true);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    fileWriter.write(noteTitle);
                    fileWriter.write(noteBody);
                    fileWriter.write("\n");
                    JOptionPane.showMessageDialog(noteWindow.getFrm(),"Nota salvata con successo");
                    fileWriter.flush();
                    fileWriter.close();
                    noteWindow.getTxtTitle().setText("");
                    noteWindow.getTxtNote().setText("");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }
}
