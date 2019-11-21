package lesson4.threads.miner;

public class Miner extends Thread {
    public static final int POWER = 3;
    String name;

    Resource resource;

    int balance;

    public Miner(Resource resource, String name) {
        this.name = name;
        this.resource = resource;
        start();
    }

    @Override
    public void run() {
        try {

                mine();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void mine() throws InterruptedException {
        while (!resource.isEmpty()) {
            if (resource.getCount() >= POWER) {
                resource.takeResource(POWER);
                balance += POWER;
            } else {
                balance += resource.getCount();
                resource.takeResource(resource.getCount());
            }

            System.out.println(name + " mined " + balance + " golds");
            sleep(1000);
        }
    }
}
