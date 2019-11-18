package lesson3;

import java.io.*;

public class Baos {
    public static void main(String[] args) {
        Human h = new Human("human1", 30);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(h);
            oos.flush();

            byte[] bytes = baos.toByteArray();
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bytes));
            try {
                Human h2 = (Human)ois.readObject();
                System.out.println(h2);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
