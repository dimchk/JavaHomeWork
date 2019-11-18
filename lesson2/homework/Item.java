package lesson2.homework;

abstract public class Item {
    protected int strange;
    protected int intelligence;
    protected int agility;

    public int getStrange() {
        return strange;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getAgility() {
        return agility;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "Strange=" + strange +
                ", Intelligence=" + intelligence +
                ", Agility=" + agility +
                '}';
    }
}
