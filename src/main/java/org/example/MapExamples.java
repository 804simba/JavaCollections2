package org.example;

import java.util.*;

public class MapExamples {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", "Timothy");
        map.put("age", "30");
        map.put("sex", "Male");
        map.put("title", "Mr.");
        System.out.println(map);
        Map<Integer, LinkedList<String>> newMap = new HashMap<>();
        LinkedList<String> names = new LinkedList<>();
        names.add("Hannah");
        names.add("Abigail");

        newMap.put(1, names);
        System.out.println(newMap);
    }
}
