package lesson3;

import java.io.*;
import java.util.Arrays;

public class Human implements Externalizable {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Human() {
        age = 5;
        name = "test";
    }

    public static void main(String[] args)
    {
        Human h = new Human("Human", 30);
       // System.out.println(Arrays.toString(h.getName().getBytes()));
        try {
            File file = new File("serial.txt");
//            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("serial.txt")));
//            oos.writeObject(h);
//            oos.close();
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
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

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.write(age);
        out.writeChars(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        age = in.read();
        name = in.readLine();
    }
}
