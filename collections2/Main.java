package collections2;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Rajkumar", "V B", 1, "Software", new Date());
        Student student2 = new Student("Rajkumar", "V B", 1, "Software", new Date());
        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));
    }
}
