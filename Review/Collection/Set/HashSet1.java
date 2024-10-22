package Set;

import Model.Student;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Z");
        set.add("A");

        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student("b", 19));
        hashSet.add(new Student("b", 18));
//        System.out.println(hashSet.toString());

        for (Student s : hashSet) {
            System.out.println(s);
        }

        TreeSet<String> treeSet = new TreeSet<>(set);

        System.out.println(treeSet); // sorted by default
    }
}
