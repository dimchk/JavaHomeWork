package lesson3;

public class Cat extends Animal {
    public Cat() {
        setLegsCount(4);
    }

    @Override
    public void voice() {
        System.out.println("Mew mew");
    }
}
