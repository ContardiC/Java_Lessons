package spacecoding.threads;

public class Counter extends Thread{
    public void run(){
        setName("Thread Counter");
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<7;i++){
            System.out.println((i+1)+" ");
        }
    }
}
