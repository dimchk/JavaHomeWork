package lesson4.threads.miner;

public class Main {
    public static void main(String[] args) {
        try {
            Resource resource = new Resource();
            new MinerFactory(5,resource);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
