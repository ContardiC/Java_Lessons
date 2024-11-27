package spacecoding.threads;

public class Counter2 extends Thread{
    public Counter2(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<7;i++){
            System.out.println((i+1)+" Sono: "+Thread.currentThread().getName());
        }
    }
}
