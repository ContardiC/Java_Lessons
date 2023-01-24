package spacecoding.threads.semaphores;

import java.util.concurrent.Semaphore;

public class ConnectionPool {
    private Semaphore semaphore;
    private int connections = 0;
    private int maxConnections;

    public ConnectionPool(int maxConnections) {
        this.maxConnections = maxConnections;
        semaphore = new Semaphore(maxConnections);
    }

    public void acquireConnection() {
        try {
            semaphore.acquire();
            connections++;
            System.out.println(Thread.currentThread().getName() + " ha ottenuto una connessione. Connessioni attive: " + connections);
            Thread.sleep(1000); // simula l'utilizzo di una connessione
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void releaseConnection() {
        connections--;
        System.out.println(Thread.currentThread().getName() + " ha rilasciato una connessione. Connessioni attive: " + connections);
        semaphore.release();
    }

    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool(5);

        // creiamo 10 thread che cercano di ottenere una connessione
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                pool.acquireConnection();
                pool.releaseConnection();
            }).start();
        }
    }
}