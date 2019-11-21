package lesson4.threads;

public class SynchronizeMain {
    public static void main(String[] args) {
        StringProducer sp = new StringProducer();
        new StringThread(sp, "A");
        new StringThread(sp, "B");
        new StringThread(sp, "C");
    }
}
