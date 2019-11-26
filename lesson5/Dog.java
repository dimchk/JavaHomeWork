package lesson5;

public class Dog {
    private int age;
    private String name;
    private boolean hasTail;

    public Dog() {
    }

    public Dog(int age, String name, boolean hasTail) {
        this.age = age;
        this.name = name;
        this.hasTail = hasTail;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hasTail=" + hasTail +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }
}
