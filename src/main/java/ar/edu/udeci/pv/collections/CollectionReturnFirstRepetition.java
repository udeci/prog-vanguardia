package ar.edu.udeci.pv.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionReturnFirstRepetition {
    public static void main(String[] args){

        Set<Integer> numbers = new HashSet<>();
        List<Integer> listNumbers = getList();
        for(int i = 1; i <= listNumbers.size(); i++){
            if(numbers.contains(listNumbers.get(i))){
                System.out.println(listNumbers.get(i));
                break;
            }
            numbers.add(listNumbers.get(i));

        }
        Collections.sort(listNumbers);
    }

    private static List<Integer> getList() {
        return Arrays.asList(1, 3, 5, 7, 9, 2, 4, 9, 8);
    }
}
