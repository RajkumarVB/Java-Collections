package collections1;

import java.util.ArrayList;
import java.util.List;
public class ListAL {
    public static void main(String[] args) {
        List<String> stringsList = new ArrayList<>();
        for(int i =0; i<20; i++){
            stringsList.add("name" + (i+1)) ;
        }
        stringsList.add("name2");
        for(int i =0; i<stringsList.size(); i++){
            System.out.print(stringsList.get(i) + " ");
        }
        System.out.println();
        System.out.println(stringsList.indexOf("name2"));
        System.out.println(stringsList.lastIndexOf("name2"));
    }
}
