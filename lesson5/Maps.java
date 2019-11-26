package lesson5;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        //java.util.Map<String, Integer> map = new HashMap<String, Integer>();
        //java.util.Map<String, Integer> map = new LinkedHashMap<String,Integer>();
        java.util.Map<String, Integer> map = new TreeMap<String, Integer>();
        map.put("one", 1);
        map.put("two", 1);
        map.put("three", 1);
        map.putIfAbsent("four", 4);

        Set<String> keys = map.keySet();
        Collection<Integer> values = map.values();

        for (String key : map.keySet())
        {
            System.out.println(key + " : " + map.get(key));
        }

//       for (java.util.Map.Entry<String, Integer> entry : map.entrySet())
//        {
//            System.out.println(entry.getKey() + entry.getValue());
//        }
    }

}
