package spacecoding.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
    public static void main(String[] args) {
        String csv = "file_di_testo.csv";
        try (BufferedReader reader = new BufferedReader(new FileReader(csv))) {
            String line;
            // TODO: se il primo record contiene il nome dei campi non stamparlo 
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(";");
                System.out.println("Nome: " + fields[0] + ", Cognome: " + fields[1] + ", Età: " + fields[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
