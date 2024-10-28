package spacecoding.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {
    public static void main(String[] args) {
       
       System.out.println("--------- Sorting Double List --------");
        // Double
        List<Double> list1 = new ArrayList<Double>();
        list1.add(2.3);
        list1.add(11.0);
        list1.add(4.6);
        list1.add(-3.6);
        list1.add(0.8);
        list1.add(12.0);

        System.out.println("unsorted list =  " + list1.toString());
        
        Collections.sort(list1);
        
        System.out.println("sorted list =  " + list1.toString());

        System.out.println("--------- Sorting Character List --------");
        List<Character> list2 = new ArrayList<Character>();
        list2.add('F');
        list2.add('B');
        list2.add('b');
        list2.add('H');
        list2.add('c');
        list2.add('A');

        System.out.println("unsorted list =  " + list2.toString());

        Collections.sort(list2);

        System.out.println("sorted list =  " + list2.toString());
        // ordina prima le lettere maiuscole in quanto sono prima delle minuscole nella ASCII table !!! 😀

        //String
        List<String > list4 = new ArrayList<String>(); 
        list4.add("cat");
        list4.add ("Dog");
        list4. add ("Monkey"); list4.add ("Lion");
        list4.add ("elephant");
        list4. add ("catania");

        System.out.println("unsorted list =  " + list4.toString());

        Collections.sort(list4);

        System.out.println("sorted list =  " + list4.toString());
        // ordina prima le lettere maiuscole in quanto sono prima delle minuscole nella ASCII table !!! 😀
    }
}