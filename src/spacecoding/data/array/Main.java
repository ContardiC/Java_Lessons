package spacecoding.data.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStreamReader in= new InputStreamReader(System.in);
        BufferedReader keyboard=new BufferedReader(in);
        Mesi mesi = new Mesi();
        int numeroMese;
        try{
            System.out.println("Inserisci il numero di un mese (da 1 a 12)");
            numeroMese=Integer.parseInt(keyboard.readLine());
            System.out.println("Mese: "+ mesi.getMese(numeroMese)+ " ed ha "+mesi.getGiorni(numeroMese)+" giorni");

        }catch(IOException e){

        }
    }
}