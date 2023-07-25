package collections7;

import collections3.Student;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Student s1 = new Student("ABC","A",1,"IT",new Date());
        Student s2 = new Student("BCA","B",2,"IT",new Date());
        Student s3 = new Student("CAB","C",3,"IT",new Date());
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(s1.getId(),s1);
        studentMap.put(s2.getId(),s2);
        studentMap.put(s3.getId(),s3);
//        System.out.println(studentMap);
        System.out.println(studentMap.get(1));

//        studentMap.put(200,null);
//        System.out.println(studentMap.get(200));
//        System.out.println(studentMap.get(300));
//        Both will return null, so don't put value as null
        for(int key : studentMap.keySet()){
            System.out.println(key);
        }
        for(Student student : studentMap.values()){
            System.out.println(student);
        }
        for (Map.Entry<Integer, Student> studentEntry : studentMap.entrySet()) {
            System.out.println(studentEntry.getKey() + " -> " + studentEntry.getValue());
        }

        System.out.println(studentMap.getOrDefault(100,new Student("AAA","A",5,"IT",new Date())));
        studentMap.putIfAbsent(400,new Student("TestFirstName","TestLastName",6,"IT",new Date()));
        System.out.println(studentMap);

        System.out.println("Iterating using for each");
        studentMap.forEach((key,value) -> System.out.println(key + "-> " + value));

        studentMap.computeIfAbsent(1000,key -> new Student("ZZZ","Z",key,"IT",new Date()));
        System.out.println(studentMap.get(1000));
    }
}
