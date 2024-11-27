import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
 
public class LocalDateExample {
 
    public static void main(String[] args) {
        // Creazione di una data
        LocalDate data = LocalDate.of(2023, 9, 22);
 
        // Accesso ai dati della data
        int giorno = data.getDayOfMonth();
        int mese = data.getMonthValue();
        int anno = data.getYear();
 
        System.out.println("Data: " + giorno + "/" + mese + "/" + anno);
 
        // Confronto di date
        LocalDate data2 = LocalDate.of(2023, 9, 21);
 
        if (data.equals(data2)) {
            System.out.println("Le date sono uguali");
        } else if (data.isBefore(data2)) {
            System.out.println("La prima data è precedente alla seconda");
        } else {
            System.out.println("La prima data è successiva alla seconda");
        }
 
        // Aggiunta di giorni
        LocalDate data3 = data.plusDays(1);
 
        System.out.println("Data dopo un giorno: " + data3);
 
        // Sottrazione di giorni
        LocalDate data4 = data.minusDays(1);
 
        System.out.println("Data prima di un giorno: " + data4);
 
        // Formattazione di una data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormattata = data.format(formatter);
 
        System.out.println("Data formattata: " + dataFormattata);
    }
}