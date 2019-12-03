package lesson7;

import com.sun.javafx.collections.MappingChange;
import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functionals {
    public static Integer toInt(Function<String, Integer> f, String s) {
        return f.apply(s);
    }
//    public static Integer toInt(BiFunction<String, Boolean, Integer> f, String s) {
//        return f.apply(s, b);
//    }

    public static void main(String[] args) {
        Function<String, Integer> func = (s) -> Integer.parseInt(s);

        int i = toInt(func, "123");
        System.out.println(i);

        BiFunction<String, Boolean, Integer> biFunc = (s,b) -> b ? Integer.parseInt(s) : -1;
        java.util.Map<String, Integer> salaries = new HashMap<String,Integer>();
        salaries.forEach((name, salary) -> salaries.put(name, salary * 1000));


        Supplier<Double> rnd = () -> Math.random();

        System.out.println(rnd.get());


    }
}
