package lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class Task {
    public static void main(String[] args) {
        ArrayList<Dog> array = new ArrayList<Dog>(Arrays.asList(new Dog(1, "Tuzik", true),
                new Dog(2, "Bobik", true),
                new Dog(4, "Maylo", false)));

        Comparator<Dog> dogComparator = new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
        };
        array.sort(dogComparator);
        Dog removeDog = new Dog();
        array.add(removeDog);
        array.remove(removeDog);

        for (Dog dog: array
             ) {
            System.out.println(dog);

        }

        array.removeIf(dog -> !dog.isHasTail());

        System.out.println("Dogs without tails");
        for (Dog dog: array
        ) {
            System.out.println(dog);
        }
    }


}
