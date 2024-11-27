package spacecoding.interface_examples;
public class Gatto implements Animale {
    @Override
    public void faiRumore() {
        System.out.println("Miao miao!");
    }

    @Override
    public void muoviti() {
        System.out.println("Il gatto sta saltando.");
    }
}