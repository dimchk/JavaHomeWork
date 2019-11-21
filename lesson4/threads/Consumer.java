package lesson4.threads;

public class Consumer extends Thread {
    Store store;
    public Consumer(Store store) {
        this.store = store;
        start();

    }

    @Override
    public void run() {
        while (true)
        {
                if (!store.isEmpty){
                    store.getResource();
                }

        }

    }
}
