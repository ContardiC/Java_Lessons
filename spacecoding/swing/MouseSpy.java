import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseSpy implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Click su:("+e.getX()+","+e.getY()+")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Premuto su:("+e.getX()+","+e.getY()+")");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Rilasciato su:("+e.getX()+","+e.getY()+")");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Quando il mouse entra su un componente
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Quando il mouse esce da un componente
    }
}
