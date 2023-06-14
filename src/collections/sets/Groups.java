package collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Groups {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        Set<Integer> integerSet = new TreeSet<>();
        Set<Character> characterSet = new LinkedHashSet<>();

        stringSet.add("Colombia");
        stringSet.add("Venezuela");
        stringSet.add("Perú");
        stringSet.add("Chile");
        stringSet.add("Ecuador");

        for (String value : stringSet) {
            System.out.println(value);
        }

        integerSet.add(3);
        integerSet.add(2);
        integerSet.add(7);
        integerSet.add(9);
        for (Integer a : integerSet) {
            System.out.println(a);
        }
        Set<String> stringSet1 = new TreeSet<>();
        stringSet1.add("Colombia");
        stringSet1.add("Venezuela");
        stringSet1.add("Perú");
        stringSet1.add("Chile");
        stringSet1.add("Ecuador");

        for (String value : stringSet1) {
            System.out.println(value);
        }

        characterSet.add('a');
        characterSet.add('b');
        characterSet.add('y');
        characterSet.add('j');
        characterSet.add('d');
        characterSet.add('n');
        for (Character value : characterSet) {
            System.out.println(value);
        }
    }
}
