package dataStructures;

import java.util.ArrayList;

public class ArrayListsEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(32);
        list.add(578);
        list.add(645);
        list.add(325);
        list.add(32);
        list.add(578);
        list.add(645);
        list.add(325);
        list.add(32);
        list.add(578);
        list.add(645);
        list.add(325);
        System.out.println(list);
        list.set(0, 23);
        System.out.println(list);
        System.out.println(list.contains(578));
    }
}
