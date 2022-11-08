package spacecoding.array.oggetti;

public class Mesi {
    private Mese[] mesi = new Mese[12];

    public Mesi() {
        mesi[0] = new Mese("gennaio",31);
        mesi[1] = new Mese("febbraio",28);
        mesi[2] = new Mese("marzo",31);
        mesi[3] = new Mese("aprile",30);
        mesi[4] = new Mese("maggio",31);
        mesi[5] = new Mese("giugno",30);
        mesi[6] = new Mese("luglio",31);
        mesi[7] = new Mese("agosto",31);
        mesi[8] = new Mese("settembre",30);
        mesi[9] = new Mese("ottobre",31);
        mesi[10] = new Mese("novembre",30);
        mesi[11] = new Mese("dicembre",31);
    }
    public Mese getDati(int i) {
        return mesi[i-1];
    }
    public String getMese(int i) {
        return mesi[i-1].getNome();
    }

    public int getGiorni(int i){
        return (mesi[i-1]).getGiorni();
    }

}
