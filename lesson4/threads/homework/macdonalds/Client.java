package lesson4.threads.homework.macdonalds;

public class Client extends Thread {

    private String clientName;
    private boolean isFull = false;

    public Client(String name) {
        clientName = name;
        start();
    }

    @Override
    public void run() {
        System.out.println(getClientName() + " is waiting to order");
    }

    public String getClientName() {
        return clientName;
    }

    public void feed(String food) {
        System.out.println(getClientName() + " got " + food);
        isFull = true;
        this.interrupt();
    }

    @Override
    public void interrupt() {
        super.interrupt();
        if (!isFull) {
            System.out.println(getClientName() + " hasn't order");
        }

    }
}
