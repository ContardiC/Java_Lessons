package spacecoding.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {
    public static void main(String[] args) {
        String csv = "file_di_testo.csv";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(csv))) {
            String[] header = {"Nome", "Cognome", "Età"};
            String[] record1 = {"Mario", "Rossi", "30"};
            String[] record2 = {"Giulia", "Bianchi", "25"};

            writer.write(String.join(";", header));
            writer.newLine();
            writer.write(String.join(";", record1));
            writer.newLine();
            writer.write(String.join(";", record2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
