package ar.edu.udeci.pv;

public class ArraysExamples {

    static int [ ] vector3 = new int [ ] {5,1,4,0};

    static int [ ] vector2 = new int [100];

    public static void main(String args[]){
        for (int i=0; i<vector3.length; i++)
            System.out.println("i:: "+ vector3[i]);

        int i = 0;
        for (int elem:vector2) {
            System.out.printf("vector2 [%d]:: %d \n", i, elem);
            i++;
        }
    }
}
