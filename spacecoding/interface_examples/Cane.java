package spacecoding.interface_examples;
public class Cane implements Animale {
    @Override
    public void faiRumore() {
        System.out.println("Bau bau!");
    }

    @Override
    public void muoviti() {
        System.out.println("Il cane sta correndo.");
    }
}