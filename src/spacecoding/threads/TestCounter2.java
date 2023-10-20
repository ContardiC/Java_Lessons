package spacecoding.threads;

public class TestCounter2 {
    public static void main(String[] args) {
        Counter2 c1=new Counter2("PuffoGino");
        Counter2 c2=new Counter2("Nino");
        c1.start();
        c2.start();
    }
}
