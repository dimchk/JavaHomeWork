package lesson2.homework;

abstract class Hero {
    protected int strange;
    protected int intelligence;
    protected int agility;
    protected Item[] items = new Item[2];

    public int getHealthPoint() {
        return strange * 200;
    }

    public void addItem(Item item) {
        // only 2 items can be in the bag of hero
        // the old one will be deleted

        if (items[1] != null) {
            // subtract stat's of item which will be deleted
            strange = strange - items[1].getStrange();
            intelligence = intelligence - items[1].getIntelligence();
            agility = agility - items[1].getAgility();
        }

        items[1] = items[0];
        // Add sta's of new item
        items[0] = item;
        // subtract stat's of item which will be deleted
        strange = strange + items[0].getStrange();
        intelligence = intelligence + items[0].getIntelligence();
        agility = agility + items[0].getAgility();


    }

    public Item[] getItems() {
        return items;
    }

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
        return "Stats " + getClass().getSimpleName() + " {" +
                "Strange=" + strange +
                ", Intelligence=" + intelligence +
                ", Agility=" + agility +
                '}';
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println("Items " + item.getClass().getSimpleName() + " "+ item);
        }
    }

    public abstract int strikeDamage();
}
