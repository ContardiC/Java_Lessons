package spacecoding.threads;

public class TestCounter {
    public static void main(String[] args) {
        System.out.println("Primo Thread:    ----> "+Thread.currentThread().getName());
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.start();
        c2.start();
    }
}
