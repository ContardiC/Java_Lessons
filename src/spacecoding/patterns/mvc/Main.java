package spacecoding.patterns.mvc;

import spacecoding.patterns.mvc.controller.Controller;
import spacecoding.patterns.mvc.view.NoteWindow;

public class Main {
    public static void main(String[] args) {
        NoteWindow noteWindow=new NoteWindow();
        Controller controller=new Controller(noteWindow);
    }
}
