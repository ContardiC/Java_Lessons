package spacecoding.collections;


import java.util.ArrayDeque;

public class StackExample2 {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        // Aggiungi elementi alla pila
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Stampa il contenuto della pila
        System.out.println("Elementi nella pila: " + stack);

        // Rimuovi l'elemento in cima alla pila
        int removedElement = stack.pop();
        System.out.println("Elemento rimosso: " + removedElement);

        // Verifica se la pila è vuota
        System.out.println("La pila è vuota: " + stack.isEmpty());
    }
}