package spacecoding.patterns.mvc.view;

import javax.swing.*;
import java.awt.*;

public class NoteWindow {
    private JFrame frm;
    private JPanel pnl;
    private JButton btnSaveNote;
    private JTextField txtTitle;
    private JTextArea txtNote;


    public NoteWindow(){
        frm=new JFrame("Java Note");
        pnl=new JPanel();
        txtTitle=new JTextField();
        txtTitle.setBounds(100,0,300,30);
        txtNote=new JTextArea();
        txtTitle.setText("");
        txtNote.setText("");
        btnSaveNote=new JButton("Save");
        pnl.setLayout(new BorderLayout());
        pnl.add(txtTitle,BorderLayout.NORTH);
        pnl.add(txtNote,BorderLayout.CENTER);
        pnl.add(btnSaveNote,BorderLayout.SOUTH);
        frm.setContentPane(pnl);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(400,600);
        frm.setVisible(true);
    }


    public JFrame getFrm() {
        return frm;
    }

    public JPanel getPnl() {
        return pnl;
    }

    public JButton getBtnSaveNote() {
        return btnSaveNote;
    }

    public JTextField getTxtTitle() {
        return txtTitle;
    }

    public JTextArea getTxtNote() {
        return txtNote;
    }
}
