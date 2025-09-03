package ar.edu.udeci.pv.collections;

import java.util.HashMap;
import java.util.Map;

public class MapTester {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        fillData(map);
        map.forEach((k, v) -> System.out.printf("%s %s%n", k, v));
        map.put("iPhone", "Created by Apple");
        map.remove("Android");
        System.out.printf(" \r\n");
        map.forEach((k, v) -> System.out.printf("%s %s%n", k, v));

        System.out.printf(" \r\n");
    }

    private static void fillData(Map<String, String> map) {
        map.put("Android", "Mobile");
        map.put("Eclipse IDE", "Java");
        map.put("Eclipse RCP", "Java");
        map.put("Eclipse RCP", "Java 11");
        map.put("Git", "Version control system");
    }
}


