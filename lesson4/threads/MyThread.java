package lesson4.threads;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Another thread");
    }

    public MyThread() {
        start();
    }

    public static void main(String[] args) {

    }
}
