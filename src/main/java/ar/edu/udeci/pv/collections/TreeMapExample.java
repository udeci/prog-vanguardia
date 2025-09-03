package ar.edu.udeci.pv.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        Map<Integer, String> treemap = new TreeMap<Integer, String>();
        treemap.put(9, "alex");
        System.out.println(treemap);
        treemap.put(7,"david");
        System.out.println(treemap);
        treemap.put(3,"peter");
        System.out.println(treemap);
        treemap.put(8,"brad");
        System.out.println(treemap);
        treemap.put(1,"ana");
        System.out.println(treemap);
    }
}
