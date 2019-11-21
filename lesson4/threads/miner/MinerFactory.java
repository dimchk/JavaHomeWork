package lesson4.threads.miner;

import static java.lang.Thread.sleep;

public class MinerFactory {
    public MinerFactory(int startMinerCount, Resource resource) throws InterruptedException {
        int i;
        for (i = 0; i < startMinerCount; i++) {
            Miner miner = new Miner(resource, "Miner-" + i);
        }
        while (!resource.isEmpty()) {
            sleep(5000);
            Miner miner = new Miner(resource, "Miner-" + i);

        }
    }
}
