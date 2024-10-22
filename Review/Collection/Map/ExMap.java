package Map;

import Model.Student;

import java.util.*;

public class ExMap {
    public static void main(String[] args) {
        Map<String, Student> mapStudent = new HashMap<>();

        mapStudent.put("6610", new Student("A", 19));
        mapStudent.put("6611", new Student("B", 20));

        System.out.println(mapStudent.get("6611"));

        System.out.println(mapStudent.containsKey("6610"));
        System.out.println(mapStudent.containsValue(new Student("A", 19))); // compared by address (Not override equal method)

        for (String key : mapStudent.keySet()) {
            Student student = mapStudent.get(key);
            System.out.println(key + ": " + student);
        }
    }
}
