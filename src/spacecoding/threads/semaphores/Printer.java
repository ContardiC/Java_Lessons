package spacecoding.threads.semaphores;

import java.util.concurrent.Semaphore;

public class Printer {
    private Semaphore semaphore;

    public Printer() {
        semaphore = new Semaphore(1); // 1 permesso disponibile
    }

    public void print(String document) {
        try {
            semaphore.acquire(); // cerca di ottenere un permesso
            System.out.println(Thread.currentThread().getName() + " sta stampando: " + document);
            Thread.sleep(1000); // simula il tempo di stampa
            System.out.println(Thread.currentThread().getName() + " ha finito di stampare: " + document);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release(); // rilascia il permesso
        }
    }

    public static void main(String[] args) {
        Printer printer = new Printer();

        // creiamo 10 thread che cercano di stampare un documento
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                printer.print("documento" + Thread.currentThread().getName());
            }).start();
        }
    }
}