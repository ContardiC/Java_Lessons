package spacecoding.threads.semaphores;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3); // 3 è il numero di permessi disponibili

        // creiamo 10 thread che cercano di ottenere un permesso
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    semaphore.acquire(); // cerca di ottenere un permesso
                    System.out.println(Thread.currentThread().getName() + " ha ottenuto un permesso.");
                    Thread.sleep(1000); // simula l'esecuzione di un'operazione
                    semaphore.release(); // rilascia il permesso
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
