import java.time.LocalDate;
import java.time.Period;
 
public class LocalDateDiff {
    public static void main(String[] args) {
        // Creazione di due date
        LocalDate data1 = LocalDate.of(2023, 10, 27);
        LocalDate data2 = LocalDate.of(2023, 12, 31);
 
        // Calcolo della differenza tra le due date
        Period periodo = Period.between(data1, data2);
 
        // Stampa della differenza
        System.out.println("La differenza tra le due date è: ");
        System.out.println("Anni: " + periodo.getYears());
        System.out.println("Mesi: " + periodo.getMonths());
        System.out.println("Giorni: " + periodo.getDays());
    }
}