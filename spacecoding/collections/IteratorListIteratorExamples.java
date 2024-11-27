package spacecoding.collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorListIteratorExamples{
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<Integer>();
        int i =1;
        for(i=1;i<51;i++){
            numbersList.add(i);
        }
        System.out.println("Lista originale: "+numbersList.toString());
        // Iterator
        Iterator<Integer> iterator = numbersList.iterator();

        while(iterator.hasNext()){
            int eachElement = iterator.next();
            if(eachElement % 3 !=0){
                iterator.remove();
            }
        }
        System.out.println("Lista modificata: "+numbersList.toString());

        // ListIterator
        ListIterator <Integer> listIterator = numbersList.listIterator();

        while(listIterator.hasNext()){
            int indexes = listIterator.nextIndex();
            System.out.println("index: " + indexes );
            int eachElement = listIterator.next();
            System.out.println("value: " + eachElement );
            if(eachElement % 2 == 0){
                listIterator.set(-1);
            }
        }
        System.out.println(numbersList.toString());
        // ListIterator ha molti più metodi di Iterator
    }
}