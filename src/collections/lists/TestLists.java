package collections.lists;

import java.util.*;

public class TestLists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(1243);
        list.add(1723);
        list.add(13);
        list.add(1236);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.indexOf(123));
        System.out.println(list.get(1));
        //Collections.sort(list);
        System.out.println(Collections.max(list));
        System.out.println(list);
    }
}
