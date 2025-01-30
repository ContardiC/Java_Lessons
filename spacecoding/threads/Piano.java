package spacecoding.threads;

public class Piano implements Runnable{
    String note;
    int numberOfTimes;
    public Piano(String note, int numberOfTimes){
        this.note=note;
        this.numberOfTimes=numberOfTimes;
    }
    @Override
    public void run() {
        for(int i=0;i<numberOfTimes;i++){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.err.println(e.toString());
            }
            System.out.println((i+1)+note+" ");
        }
    }
}
