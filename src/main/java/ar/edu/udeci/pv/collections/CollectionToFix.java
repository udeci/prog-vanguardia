package ar.edu.udeci.pv.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class CollectionToFix {

    public static void main(String[] args){
        List<Integer> listNumbers = getList();
        for(int i = 1; i <= listNumbers.size(); i++){
            System.out.println(listNumbers.get(i));
        }
        Collections.sort(listNumbers);
    }

    private static List<Integer> getList() {
        return Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8);
    }
}
