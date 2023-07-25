package collections4;

import collections3.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Rajkumar","V B",1,"IT", new Date());
        Student s2 = new Student("ABC","A B",2,"IT", new Date());
        Student s3 = new Student("CA","C",3,"IT", new Date());
        Student s4 = new Student("ZZ","Z",4,"IT", new Date());
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.sort(new StudentFirstNameComparator());
        for(Student student : studentList){
            System.out.println(student);
        }

    }
}
