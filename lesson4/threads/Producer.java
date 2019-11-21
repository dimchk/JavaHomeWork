package lesson4.threads;

public class Producer extends Thread {
    Store store;

    public Producer(Store store) {
        this.store = store;
        start();
    }
    @Override
    public void run() {
        while (true)
        {
                if (store.isEmpty){
                    store.putResource(1);
                }

        }

    }
}
