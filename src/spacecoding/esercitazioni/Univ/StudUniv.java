package spacecoding.esercitazioni.Univ;

public class StudUniv {
    private String nome, cognome;
    private int matricola;

    public StudUniv(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public StudUniv(String nome, String cognome, int m) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = m;
    }

    public String leggiNome() {
        return this.nome;
    }

    public String leggiCognome() {
        return this.cognome;
    }

    public int leggiMatricola() {
        return this.matricola;
    }

    public void aggMatricola(int m) {
        if (this.matricola == 0)
            this.matricola = m;
    }

    public String info() {
        return this.cognome + " " + this.nome + " (matr. " + this.matricola + ")";
    }
}