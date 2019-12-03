package lesson6;

public class MyThread {
    Thread thread;
    Runnable run;
    public MyThread(Runnable run) {
        Thread thread = new Thread(run);
        thread.start();
    }
}
