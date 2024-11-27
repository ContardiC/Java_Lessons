package spacecoding.collections;
import java.util.HashMap;
public class HashMapExample{
    public static void main(String[] args) {
        HashMap<String,  Integer> agesMap = new HashMap<String, Integer>();

        agesMap.put("Nino",9);
        agesMap.put("Gino",8);
        agesMap.put("Alex",2);

        System.out.println("Ages Map : " + agesMap); // non mi piace !
        System.out.println("Ages Map : " + agesMap.toString());

        // visualizza un età in base ad una chiave
        System.out.println("Age of Gino: " + agesMap.get("Gino"));

        // visuallizzo tutte le età con un foreach
        
        for(String key : agesMap.keySet()){
            System.out.println("Age of: " +  key + "is : " + agesMap.get(key));
        }

        // rimuove un elemento specificando una chiave

        agesMap.remove("Alex");
        agesMap.replace("Nino", 8);

        
        // memorizzo il valore precedente al replace
        int ageOfNino = agesMap.replace("Nino", 9);

        System.out.println("stampa il valore precedente  " + ageOfNino); 
        System.out.println("Ages Map : " + agesMap.toString());

    }
}