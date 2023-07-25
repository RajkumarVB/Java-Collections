package collections5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(integerList);
//        integerList.remove(Integer.valueOf(1));
        integerList.remove(1);
        System.out.println(integerList);
    }
}
