package collections1;

import java.util.Arrays;

public class B_ProblemWithArray {
    public static void main(String[] args) {
        String[] names = new String[20];
        Arrays.fill(names,"name ");

        for (int i = 0; i < names.length; i++) {
            names[i] = names[i] + i ;
        }
        System.out.println(Arrays.binarySearch(names,"name 4"));
    }
}
