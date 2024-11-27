package spacecoding.collections;

import java.util.Set;
import java.util.HashSet;

public class SetInterfaceExample {
    public static void main(String[] args) {
        Set<String> animalsSet = new HashSet<String>();

        animalsSet.add("Cat");
        animalsSet.add("Dog");
        animalsSet.add("Lion");
        animalsSet.add("Cow");
        System.out.println("animalsSet = " + animalsSet.toString());
        System.out.println("Size of animalsSet =" + animalsSet.size());
        animalsSet.remove("Cow");
        System.out.println("animalsSet = " + animalsSet.toString());
        System.out.println("Contains Sheep ? " + animalsSet.contains("Sheep"));

        Set<Integer> set1 = new HashSet<Integer>();
        for (int i = 1; i <= 20; i++) {
            set1.add(i);
        }
        System.out.println(set1.toString());
        Set<Integer> set2 = new HashSet<Integer>();
        for (int i =15 ; i <= 35;  i++) {
            set2.add(i );
        }
        System.out.println(set2.toString());

        // Intersection - retainAll()
        Set<Integer> intersectionSet = new HashSet<Integer>(set1); // assegno set1 ad intersectionSet
        intersectionSet.retainAll(set2);
        System.out.println("-  Intersection : "+ intersectionSet.toString());
        
        // Union - addAll()
        Set<Integer> unionSet = new HashSet<Integer>(set1);
        unionSet.addAll(set2);
        System.out.println("-  Union : "+ unionSet.toString());
        // Difference - removeAll()
        Set<Integer> differenceSet = new HashSet<Integer>(set1);
        differenceSet.removeAll(set2);
        System.out.println("- Difference :" + differenceSet.toString());
    }
}