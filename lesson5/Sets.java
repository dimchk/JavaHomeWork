package lesson5;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> hash = new HashSet<String>();
        hash.add("");
        hash.add("test");
        hash.add("test 1");
        for (String e : hash
             ) {
            System.out.println(e);
        }

        Set<String> tree = new TreeSet<String>();
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };
        Set<String> treeSet = new TreeSet<String>(comparator);
        tree.add("test");
        tree.add("test1");
    }
}
