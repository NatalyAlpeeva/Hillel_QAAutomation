package dz10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Dz10method {
    public static void main(String[] args) {
        dz10method("butter, butter, kolbasa, milk");
    }
    private static void dz10method(String str) {
                String[] arrOfStr = str.replace(",","").replace(".", "").split(" ");
                Set<String> set=new HashSet<>(Arrays.asList(arrOfStr));
                for (String a:set) System.out.println(a);
        }
    }
