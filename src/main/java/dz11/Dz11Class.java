package dz11;

import java.util.Map;
import java.util.TreeMap;


public class Dz11Class {
    public static void Dz11Method(Map<Integer, String> integerStringMap) {
        Map<Integer, String> intMap = new TreeMap<>(integerStringMap);
        for (Integer a : intMap.keySet()) {
            System.out.println(a + "=" + intMap.get(a));
        }
    }
}
