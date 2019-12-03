package lesson7;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
//        Stream<String> stream = Stream.of("a", "b", "c");
        Stream<String> stream = Stream.of("a", "b", "c");


        List<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "a"));

        //stream = list.stream();
        //stream.forEach(s -> System.out.println(s));
        //stream.distinct().forEach(s -> System.out.println(s));
        list = stream.filter(s -> s.contains("c")).collect(Collectors.toList());


        HashMap<String, Integer> nums = new HashMap<String, Integer>();
        nums.put("One", 1);
        nums.put("Two", 2);
        nums.put("Three", 3);
        List<Number> numberList = nums.entrySet().stream()
                .map(e -> new Number().str(e.getKey()).integer(e.getValue()))
                .collect(Collectors.toList());

        Optional<Number> number = numberList.stream().findAny();


        number.ifPresent(number1 -> System.out.println(number1));
        System.out.println(numberList);
        System.out.println(list);

        List<Description> d = new ArrayList<Description>();
        d.add(new Description(Arrays.asList("desc1", "desc2")));
        d.add(new Description(Arrays.asList("desc3", "desc4")));
        d.add(new Description(Arrays.asList("desc5", "desc6")));

        Stream<String> strings = d.stream().flatMap(description -> description.getDescs().stream());

        strings.forEach(s -> System.out.println(s + ""));


    }
}
