package dz11;

import com.sun.source.tree.Tree;
import org.apache.maven.shared.utils.StringUtils;

import java.util.*;

public class Dz11 {
    public static void main(String[] args) {
        Map<Integer, String> intMap=new TreeMap<>();
        intMap.put(1, "cat");
        intMap.put(99, "dogs");
        intMap.put(3, "tigers");
        intMap.put(45, "squirrel");
        intMap.put(100, "lion");
        intMap.put(60, "bird");
        intMap.put(2, "parrot");
        for (Integer a:intMap.keySet()) {
            System.out.println(a+"="+intMap.get(a));
        }
    }
}
