public class ThreadExample1{
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println("We are now in thread -> "+ Thread.currentThread().getName());
            }
        });
        
        thread.setName("New Worker Thread");
        // thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("We are in thread -> (" + Thread.currentThread().getName() +") before starting a new thread");
        thread.start();
        System.out.println("We are in thread -> (" + Thread.currentThread().getName() +") after starting a new thread");
        // try {
        //     Thread.sleep(5000);
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }

    }
}