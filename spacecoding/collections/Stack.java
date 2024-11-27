package spacecoding.collections;

public class Stack {
    int[] elements;
    int size;

    public Stack(int capacity) {
        elements = new int[capacity];
        size = 0;
    }

    public void push(int element) {
        if (size == elements.length) {
            throw new IllegalStateException("La pila è piena!");
        }
        elements[size++] = element;
    }

    public int pop() {
        if (size == 0) {
            throw new IllegalStateException("La pila è vuota!");
        }
        return elements[--size];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}