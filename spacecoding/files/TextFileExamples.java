package spacecoding.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class TextFileExamples{
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader key = new BufferedReader(in);
        File file = new File("users.txt");
        String userName= " ";
        char[] array = new char[1000];
        // scrittura del file
        try{
            FileWriter fileWriter = new FileWriter(file,true);
            System.out.println("Inserisci il tuo nome: ");
            userName = key.readLine();
            fileWriter.write(userName + "\n");
            // dopo aver scritto chiudere lo stream 
            fileWriter.close();
        }catch(IOException e){
            System.out.println("Errore apertura file");
            // e.printStackTrace(); per il debug
        }
        // lettura del file 
        //FileReader
        try{
            FileReader fileReader = new FileReader(file);
            System.out.println("Elenco degli utenti presenti nel file [users.txt]");
            // il metodo read utilizza un array di caratteri
            fileReader.read(array);
            System.out.println(array);
            fileReader.close();
        }catch(IOException e){
            System.out.println("Errore apertura file");
            e.printStackTrace();
        }
    }
}