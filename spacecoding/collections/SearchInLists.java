package spacecoding.collections;
import java.util.ArrayList;
import java.util.Collections;
public class SearchInLists{
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<Integer>();
        numbersList.add(19);
        numbersList.add(9);
        numbersList.add(1);
        numbersList.add(190);
        numbersList.add(219);
        numbersList.add(-19);
        int indexOfNumber = Collections.binarySearch(numbersList, 1);

        System.out.println("il numero 1 ha indice: " + indexOfNumber);
        indexOfNumber = Collections.binarySearch(numbersList, 2);
        System.out.println("il numero 2 (non presente) ha indice: " + indexOfNumber);
        // restituisce un indice negativo in quanto il numero non è presente nella lista
    }
}