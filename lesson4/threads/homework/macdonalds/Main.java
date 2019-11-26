package lesson4.threads.homework.macdonalds;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String[] names = {"Dima", "Sasha", "Vova", "Alena", "Nikita"};
        ArrayList<Client> clients = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            clients.add(new Client(names[(int) (Math.random() * 5)]));
        }
        boolean cashOpen = true;
        for (Client client : clients
        ) {
            // First client must get an order
            double cashOpenChance = (clients.indexOf(client) == 0) ? 1 : Math.random();
            if (cashOpenChance >= 0.5 && cashOpen ) {
                System.out.println("\nCashbox is open");
                System.out.println("---------------");
                System.out.println(client.getClientName() + " is ordering");
                int time = (int) (Math.random() * 3 + 5);
                System.out.println("Order will be cooking " + time + " seconds");
                Thread.sleep(time * 1000);
                client.feed("Cheeseburger");

            } else {
                Thread.sleep(500);
                System.out.println("\nCashbox is close");
                System.out.println("----------------");
                cashOpen = false;
                client.interrupt();
            }
        }

    }
}
