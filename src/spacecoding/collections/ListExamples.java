package spacecoding.collections;
import java.util.*;
class ListExamples{
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>(); // Polymorphism

        List<Integer> list2;
        list2 = new ArrayList<Integer>();

        Collection<Integer> list4 = new ArrayList<Integer>(); // List extends Collection and ArrayList implements List

        List list5 = new ArrayList(); // Generic List

        list5.add("Hello Java Developers");

        String message = (String)list5.get(0);  //  Casting to String

    }
}