package lesson2.homework;

public class Zeus extends Hero {
    public Zeus() {
        strange = 21;
        agility = 11;
        intelligence = 23;
    }

    @Override
    public int strikeDamage() {
        return (int) (intelligence + strange * 0.5 + agility * 0.5);
    }
}
