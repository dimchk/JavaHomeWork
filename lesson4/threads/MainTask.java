package lesson4.threads;

public class MainTask {
    public static void main(String[] args) {
        Store store =  new  Store();

        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
    }

}
