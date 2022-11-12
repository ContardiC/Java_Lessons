package spacecoding.patterns.mvc.controller;

import spacecoding.patterns.mvc.model.Note;
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
    private Note note;
    public Controller(NoteWindow noteWindow){
        this.noteWindow=noteWindow;
        this.noteWindow.getBtnSaveNote().addActionListener(this);
        notes=new File("notes.csv");
        note=new Note();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==noteWindow.getBtnSaveNote()){
            JLabel lblDialog=new JLabel("La nota è vuota non può essere salvata");
            System.out.println("Save Button clicked");
            note.setTitle(noteWindow.getTxtTitle().getText());
            note.setBody(noteWindow.getTxtNote().getText());
            System.out.println(note.toString());
            if(note.getBody().equals("")){
                JOptionPane.showMessageDialog(noteWindow.getFrm(),"La nota è vuota");
            }else{
                if(note.getTitle().equals("")){
                    noteTitle="SENZA NOME"+";";
                }else{
                    noteTitle=note.getTitle();
                }
                noteBody=note.getBody();
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
