package spacecoding.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class TextFileExamples{
    public static void main(String[] args) {
        File file = new File("data.txt");
        char[] array = new char[100];
        // scrittura del file
        try{
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Un mio gatto si chiama Gino \n");
            fileWriter.write("e l'altro Nino");
            // dopo aver scritto chiudere lo stream 
            fileWriter.close();
        }catch(IOException e){
            System.out.println("Errore apertura file");
            e.printStackTrace();
        }
        // lettura del file 
        //FileReader
        try{
            FileReader reader = new FileReader(file);
            // il metodo read utilizza un array di caratteri
            reader.read(array);
            System.out.println(array);
            reader.close();
        }catch(IOException e){
            System.out.println("Errore apertura file");
            e.printStackTrace();
        }

    }
}