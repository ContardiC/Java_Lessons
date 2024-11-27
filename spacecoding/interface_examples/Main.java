package spacecoding.interface_examples;
public class Main {
    public static void main(String[] args) {
        Animale animale1 = new Cane();
        Animale animale2 = new Gatto();

        animale1.faiRumore(); // Output: Bau bau!
        animale2.muoviti(); // Output: Il gatto sta saltando.
    }
}