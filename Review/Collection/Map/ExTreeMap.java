package Map;

import Model.Student;

import java.util.Map;
import java.util.TreeMap;

public class ExTreeMap {
    public static void main(String[] args) {
        Map<String, Student> studentMap = new TreeMap<>(); // sorted by key

        studentMap.put("6610402060", new Student("A", 20));
        studentMap.put("6610402000", new Student("B", 18));

        for (String key : studentMap.keySet()) {
            System.out.println(key + ": " + studentMap.get(key));
        }
    }
}
