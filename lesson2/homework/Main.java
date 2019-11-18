package lesson2.homework;

public class Main {
    public static void main (String[] args)
    {
        Hero pudge = new Pudge();
        Hero zeus = new Zeus();


        System.out.println("--Without Items--");
        System.out.println(pudge.toString());
        System.out.println("Damage = " + pudge.strikeDamage());
        System.out.println("HP = " + pudge.getHealthPoint());
        System.out.println();
        System.out.println(zeus.toString());
        System.out.println("Damage = " + zeus.strikeDamage());
        System.out.println("HP = " + zeus.getHealthPoint());

        System.out.println("--------------");


        Item bkb = new BlackKingBar();
        Item talisman = new NullTalisman();

        pudge.addItem(bkb);
        pudge.addItem(talisman);

        zeus.addItem(bkb);
        zeus.addItem(talisman);

        System.out.println("--With Items--");
        System.out.println(pudge);
        pudge.printItems();
        System.out.println("Damage = " + pudge.strikeDamage());
        System.out.println("HP = " + pudge.getHealthPoint());


        System.out.println();

        System.out.println(zeus);
        zeus.printItems();
        System.out.println("Damage = " + zeus.strikeDamage());
        System.out.println("HP = " + zeus.getHealthPoint());


    }
}
