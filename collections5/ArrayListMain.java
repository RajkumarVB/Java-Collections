package collections5;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Name A");
        names.add("Name B");
        System.out.println(names);

        names.add("Name A");
        System.out.println(names);

        names.set(2,"Name C");
        System.out.println(names);

        System.out.println(names.get(0));
//        System.out.println(names.get(200)); // IndexOutOfBoundException
        names.add(1,"Name D");
        System.out.println(names);

        names.remove("Name D");
        System.out.println(names);

        names.remove(0);
        System.out.println(names);
    }
}
