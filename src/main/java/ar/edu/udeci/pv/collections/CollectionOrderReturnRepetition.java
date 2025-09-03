package ar.edu.udeci.pv.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class CollectionOrderReturnRepetition {

    public static void main(String[] args){
        List<Integer> listNumbers = getList();
        Collections.sort(listNumbers);
        boolean result = false;
        int end = listNumbers.size() - 1;
        for(int i = 0; i <= end; i++){
            if((i+1) < end && listNumbers.get(i).equals(listNumbers.get(i+1))) {
                System.out.println("El numero repetido es "+listNumbers.get(i));
                result = true;
                break;
            }
        }
        if (!result) System.out.println("No hay numero repetido");
    }

    private static List<Integer> getList() {
        return Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8, 2, 7, 89, 367);
    }
}
