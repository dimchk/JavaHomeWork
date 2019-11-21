package lesson4.threads;

public class Worker1 extends Thread {
    Shared shared;

    public Worker1(Shared shared) {
        this.shared = shared;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            shared.x++;
        }
    }
}
