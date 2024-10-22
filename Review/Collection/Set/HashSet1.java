package Map;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Z");
        set.add("A");

        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student("b", 10));
        hashSet.add(new Student("z", 20));

        System.out.println(hashSet.toString());

        for (Student s : hashSet) {
            System.out.println(s.getName());
        }

        TreeSet<String> treeSet = new TreeSet<>(set);

        System.out.println(treeSet); // sorted by default
    }
}
