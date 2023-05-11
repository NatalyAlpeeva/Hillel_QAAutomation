package dz11;

import java.util.*;

public class Dz11 {
    public static void main(String[] args) {
        Map<Integer, String> intMap=new HashMap<>();
        intMap.put(1, "cat");
        intMap.put(99, "dogs");
        intMap.put(3, "tigers");
        intMap.put(45, "squirrel");
        intMap.put(100, "lion");
        intMap.put(60, "bird");
        intMap.put(2, "parrot");
        intMap = sortByKeys(intMap);
        System.out.println(intMap);
    }

    private static Map<Integer, String> sortByKeys(Map<Integer, String> unsortedMap) {
        return new TreeMap<>(unsortedMap);
    }
}
