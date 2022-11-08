package spacecoding.array.oggetti;

public class Mese {
    private String nome;
    private int giorni;
    public Mese(String n, int g) {
        nome = n;
        giorni = g;
    }
    public String getNome(){
        return nome;
    }
    public int getGiorni(){
        return giorni;
    }
}
