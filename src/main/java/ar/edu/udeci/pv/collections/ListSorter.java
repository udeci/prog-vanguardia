package ar.edu.udeci.pv.collections;

import java.util.Arrays;
import java.util.List;

public class ListSorter {



    public static void main(String[] args) {
        List<String> l1 = createList();
        l1.sort(null);
        l1.forEach(System.out::println);

        System.out.println(" \r\n \r\n Sort 1 \r\n");

        List<String> l2 = createList();
        l2.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        l2.forEach(System.out::println);

        System.out.println(" \r\n \r\n Sort 2 \r\n");

        List<String> l3 = createList();
        l3.sort(String::compareToIgnoreCase);
        l3.forEach(System.out::println);
    }


    public static void main2(String[] args) {
        List<String> l1 = createList();
        l1.sort(null);
        l1.forEach(System.out::println);

        System.out.println(" \r\n \r\n Sort 1 \r\n");

        List<String> l2 = createList();
        l2.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        l2.forEach(System.out::println);

        System.out.println(" \r\n \r\n Sort 2 \r\n");

        List<String> l3 = createList();
        l3.sort(String::compareToIgnoreCase);
        l3.forEach(System.out::println);
    }
    private static List<String>  createList() {
        return Arrays.asList("iPhone", "Ubuntu", "Android", "Mac OS X");
    }
}