package lesson5;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import lesson7.Number;

import java.util.*;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        String[] myStrings = {"BMW", "Audi", "Mercedes"};
        int floorCount = 4;
        java.util.Map<Integer, Map<Integer, Car>> floors = new HashMap<Integer, Map<Integer, Car>>();
        for (int i = 0; i < floorCount; i++) {
            int count = (int) (Math.random() * 4 +1);
            Map<Integer, Car> parkPlace = new HashMap<Integer, Car>();
            for (int j = 0; j < count; j++) {
                Car car = new Car(1992, myStrings[(int) (Math.random() * 3)]);
                parkPlace.put(j, car);
            }
            floors.put(i, parkPlace);
        }


//        for (Integer key : floors.keySet()) {
//            System.out.println("Floor number " + key);
//
//            for (Object car : parking.get(key).keySet()) {
//                System.out.println(car);
//            }
//
//        }
        System.out.println(floors);
        List<Car> cars = new ArrayList<Car>();
        floors.values().forEach(integerCarMap -> cars.addAll(integerCarMap.values()));
        System.out.println(cars);

        floors.entrySet().stream().
                forEach(floor -> System.out.println(floor
                        .getValue()
                        .entrySet()
                        .stream().count()));

    }


}
