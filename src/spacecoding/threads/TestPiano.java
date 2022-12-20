package spacecoding.threads;

public class TestPiano {
    public static void main(String[] args) {
        // metodo 1
        Runnable run_p1=new Piano("DO",5);
        Thread p1=new Thread(run_p1);
        p1.start();
        // metodo 2
        Thread p2=new Thread(new Piano("SOL",5));
        p2.start();
        // metodo 3
        new Thread(new Piano("Mib",5)).start();
    }
}
