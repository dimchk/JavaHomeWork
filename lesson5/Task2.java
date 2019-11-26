package lesson5;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        String[] myStrings = { "BMW", "Audi", "Mercedes" };
        int floorCount = 4;
        java.util.Map<Integer, Map> parking = new HashMap<Integer, Map>();
        for (int i = 0; i < floorCount; i++) {
            int count = (int)(Math.random() * 10);
            java.util.Map<Integer, Map<Integer, Car>> floors = new HashMap<Integer, Map<Integer, Car>>();
            for (int j = 0; j < count ; j++) {
                    Map<Integer, Car> parkPlace = new HashMap<Integer, Car>();
                parkPlace.put(j, new Car((int)(Math.random()*2000 + 2010), myStrings[(int)(Math.random()*3)] ));
            }

            //arking.put(i);
        }

        for (Integer key : parking.keySet())
        {
            System.out.println("Floor number " + key);

            for (Object car: parking.get(key).keySet())
            {
                System.out.println(car);
            }

        }

    }


}
