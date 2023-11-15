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
            FileWriter writer = new FileWriter(file);
            writer.write("Un mio gatto si chiama Gino \n");
            
            writer.write("e l'altro Nino");
            writer.close();
        }catch(IOException e){
            System.out.println("Errore apertura file");
            e.printStackTrace();
        }
        // lettura del file 
        //FileReader
        try{
            FileReader reader = new FileReader(file);
            reader.read(array);
            System.out.println(array);
            reader.close();
        }catch(IOException e){
            System.out.println("Errore apertura file");
            e.printStackTrace();
        }

    }
}