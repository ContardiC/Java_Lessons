package spacecoding.basicop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class InAndOut {
    public static void main(String[] args) {
        // creo l'oggeto per leggere da Standard Input
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader keyboard=new BufferedReader(in);
        // variabili
        String name;
        String strYOB; // YOB= year of birthday
        Integer intYOB;
        Integer currentYear;
        Calendar calendar;
        try{
            System.out.println("Come ti chiami?");
            name=keyboard.readLine();
            System.out.println("Ciao: "+name);
            System.out.println("In che anno sei nato?");
            strYOB= keyboard.readLine();
            intYOB=Integer.parseInt(strYOB);

            calendar= GregorianCalendar.getInstance();
            currentYear=calendar.get(Calendar.YEAR);
            System.out.println("Hai " + (currentYear-intYOB) +" anni");

        }catch (IOException e){
            // gestione dell'eccezione
        }
    }
}
