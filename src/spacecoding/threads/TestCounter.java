package spacecoding.threads;

public class TestCounter {
    public static void main(String[] args) {
        System.out.println("Primo Thread:    ----> "+Thread.currentThread().getName());
        Counter counter=new Counter();
        counter.start();
    }
}
