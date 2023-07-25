package collections6;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Name A");
        names.add("Name B");
        System.out.println(names);

        boolean result = names.add("Name A");
        System.out.println(result);
        System.out.println(names);

        names.remove("Name B");
        System.out.println(names);

        System.out.println(names.contains("Name A"));
    }
}
