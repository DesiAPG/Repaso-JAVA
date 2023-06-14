package collections.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Groups {
    public static void main(String[] args) {
        Map<Integer, String> integerStringMap = new HashMap<>();
        Map<Integer, String> integerStringMap1 = new TreeMap<>();
        Map<Integer, String> integerStringMap2 = new LinkedHashMap<>();

        integerStringMap.put(12, "Duvan");
        integerStringMap.put(32, "Camilo");
        integerStringMap.put(5, "Cristian");
        integerStringMap.put(172, "Sebastian");
        integerStringMap.put(182, "Pedro");
        integerStringMap.put(142, "Sarmiento");
        for (Map.Entry<Integer, String> entry : integerStringMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " - Valor: " + entry.getValue());
        }
        System.out.println();
        integerStringMap1.put(12, "Duvan");
        integerStringMap1.put(32, "Camilo");
        integerStringMap1.put(5, "Cristian");
        integerStringMap1.put(172, "Sebastian");
        integerStringMap1.put(182, "Pedro");
        integerStringMap1.put(142, "Sarmiento");
        for (Map.Entry<Integer, String> entry : integerStringMap1.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " - Valor: " + entry.getValue());
        }
        System.out.println();
        integerStringMap2.put(12, "Duvan");
        integerStringMap2.put(32, "Camilo");
        integerStringMap2.put(5, "Cristian");
        integerStringMap2.put(172, "Sebastian");
        integerStringMap2.put(182, "Pedro");
        integerStringMap2.put(142, "Sarmiento");
        for (Map.Entry<Integer, String> entry : integerStringMap2.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " - Valor: " + entry.getValue());
        }
    }
}
