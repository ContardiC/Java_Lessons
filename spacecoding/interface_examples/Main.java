package spacecoding.interface_examples;
public class Main {
    public static void main(String[] args) {
        Animale animale1 = new Cane();
        Animale animale2 = new Gatto();

        animale1.faiRumore();
        animale2.muoviti();
    }
}