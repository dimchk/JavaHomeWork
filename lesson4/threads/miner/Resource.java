package lesson4.threads.miner;

public class Resource {
    private volatile int count = 100;

    public synchronized boolean isEmpty() {
        return count <= 0;
    }

    public synchronized void takeResource(int count) {
        this.count -= count;
    }

    public synchronized int getCount() {
        return count;
    }
}
