package Model;

import java.util.Hashtable;

public class CollectionDemo {
    public static void main(String[] args) {
        Hashtable<String, Student> students = new Hashtable<>();

        putStudent(students, "6610", new Student("P", 20));

        for (String key : students.keySet()) {}
    }

    private static Thread putStudent( Hashtable<String, Student> students, String key, Student student) {
        Thread thread = new Thread(() -> {
            students.put(key, student);
        });
        return thread;
    }
}
