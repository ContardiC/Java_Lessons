package spacecoding.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class ComparatorExample{
    public static void main(String[] args) {
        ArrayList<Character> charsList = new ArrayList<Character>();
        charsList.add('b');
        charsList.add('Z');
        charsList.add('A');
        charsList.add('c');
        charsList.add('B');

        Collections.sort(charsList );

        System.out.println(charsList.toString());
        
        Collections.sort(charsList, new MyChars() );

        System.out.println(charsList.toString());


    }
}
// se voglio cambiare il metodo di ordinamento posso creare una classe che implementa Comparator 
// specificando come voglio ordinare
class MyChars implements Comparator<Character>{

    @Override
    public int compare(Character o1, Character o2) {
        if(o1 < o2){
            return 1;
        }else if(o1 >o2){
            return -1;
        }else{
            return 0;
        }
    }

}