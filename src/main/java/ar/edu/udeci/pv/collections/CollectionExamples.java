package ar.edu.udeci.pv.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class CollectionExamples {

    public static void main(String[] args){
        collections1();
    }

    public static void collections1(){
        List<String> listNames = Arrays.asList("John", "Peter", "Tom", "Mary", "David", "Sam");
        List<Integer> listNumbers = Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8);
        System.out.println(listNames);
        System.out.println(listNumbers);

        Collections.sort(listNames);
        Collections.sort(listNumbers);

        System.out.println(listNames);
        System.out.println(listNumbers);

        Collections.reverse(listNumbers);

        System.out.println(listNumbers);

        //to create thread-safe
        List<Object> unsafeList = new ArrayList<Object>();
        List<Object> safeList = Collections.synchronizedList(unsafeList);

    }
}
