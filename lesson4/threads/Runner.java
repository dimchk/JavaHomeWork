package lesson4.threads;

public class Runner extends Thread {
    int path = 0;

    Thread concurrent;

    String name;

    public Runner(String name) {
        this.name = name;
    }

    private static final int MAX_PATH = 20;

    @Override
    public void run() {
        while (path < MAX_PATH) {
            int steps = (int) (Math.random() * 3);
            path += steps;

            System.out.println(name + " made " + path + " steps");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
