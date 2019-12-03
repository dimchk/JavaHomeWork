package lesson4.threads.homework.killThread;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Player> players = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            players.add(new Player(i));
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(players.toString());
            System.out.println(players.size());
            if (players.size() != 1) {
                int removedId = (int) (Math.random() * players.size() - 1);
                System.out.println("Thread with id " + players.get(removedId).id + " will be removed ");
                players.remove(removedId);
                Thread.sleep(2000);
            } else {
                break;
            }

        }

        System.out.println(players.toString() + " is win");
    }
}
