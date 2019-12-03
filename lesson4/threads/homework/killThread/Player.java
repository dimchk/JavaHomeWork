package lesson4.threads.homework.killThread;

public class Player extends Thread {
    int id;

    public Player(int id) {
        this.id = id;
        start();
    }

    @Override
    public void run() {
        System.out.println("Thread number " + id + " is started");
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                '}';
    }
}
