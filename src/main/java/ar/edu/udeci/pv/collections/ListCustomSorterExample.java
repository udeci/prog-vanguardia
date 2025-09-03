package ar.edu.udeci.pv.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListCustomSorterExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,4,3,7,2,1);

        List<Integer> listDp = new ArrayList<>();
        listDp.addAll(Arrays.asList(5,4,3,7,2,1));
        listDp.add(new Integer(87));

        Collections.sort(listDp);
        System.out.println(listDp);


        // custom comparator
        Collections.sort(list, (o1, o2) -> (o1>o2 ? -1 : (o1==o2 ? 0 : 1)));
        // alternative can could reuse the integer comparator
        //Collections.sort(list);
        System.out.println(list);

        System.out.println(" \r\n  \r\n");
        Collections.reverse(list);
        System.out.println(list);

        System.out.println(" \r\n  \r\n");

        list.forEach(System.out::println);
    }
}
