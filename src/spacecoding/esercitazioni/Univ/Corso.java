package spacecoding.esercitazioni.Univ;

public class Corso {
    private String nomeCorso, nomeDocente, ssd;
    private int cfu;
    private StudUniv[] studenti;
    private int cont = 0;

    public Corso(String nc, String nd, int c, String ssd, int m) {
        this.nomeCorso = nc;
        this.nomeDocente = nd;
        this.cfu = c;
        this.ssd = ssd;
        this.studenti = new StudUniv[m];
    }

    public String leggiNomeCorso() {
        return this.nomeCorso;
    }

    public String leggiNomeDocente() {
        return this.nomeDocente;
    }

    public int leggiNumCfu() {
        return this.cfu;
    }

    public String leggiSSD() {
        return this.ssd;
    }

    public StudUniv[] leggiElencoStudenti() {
        return this.studenti;
    }

    public void aggStudente(StudUniv s) {
        if (this.cont < this.studenti.length) {
            this.studenti[cont] = s;
            this.cont++;
        }
    }

    public int[] elencoMatricole() {
        int[] a = new int[cont];
        for (int i = 0; i < cont; i++) {
            a[i] = this.studenti[i].leggiMatricola();
        }
        return a;
    }

    public StudUniv[] elencoStudenti(int k) {
        int c = 0;
        for (int i = 0; i < cont; i++) {
            if (this.studenti[i].leggiMatricola() > k)
                c++;
        }
        StudUniv[] a = new StudUniv[c];
        int j = 0;
        for (int i = 0; i < cont; i++) {
            if (this.studenti[i].leggiMatricola() > k) {
                a[j] = this.studenti[i];
                j++;
            }
        }
        return a;
    }

    public boolean esisteStudente(String nome, String cognome) {
        for (int i = 0; i < cont; i++) {
            if (this.studenti[i].leggiNome().equals(nome) &&
                    this.studenti[i].leggiCognome().equals(cognome))
                return true;
        }
        return false;
    }
}
