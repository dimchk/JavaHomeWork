package lesson2.homework;

public class Pudge extends Hero {
    public Pudge() {
        strange = 25;
        agility = 14;
        intelligence = 16;
    }

    @Override
    public int strikeDamage() {
        return (int) (strange + agility * 0.5 + intelligence * 0.5);
    }
}
