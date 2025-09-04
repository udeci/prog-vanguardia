package ar.edu.udeci.pv.vector;

import java.util.ArrayList;
import java.util.List;

public class MatrixXVector {


    /*
    Producto de matriz por vector
    Enunciado: Escribe una función que tome una matriz de m×n (representada como un arreglo de arreglos) y un vector de n componentes. La función debe calcular el producto de la matriz por el vector y devolver el vector resultante. Para realizar el producto, cada componente del vector resultante es el producto punto de la fila correspondiente de la matriz con el vector. Asegúrate de manejar el caso donde las dimensiones no son compatibles, lo cual ocurre si el número de columnas de la matriz no es igual al número de filas del vector.

    Ejemplo:

    Matriz M: [[1,2,3],[4,5,6]]

    Vector V: [10,20,30]

    Vector Resultante: [(1∗10+2∗20+3∗30),(4∗10+5∗20+6∗30)]=[(10+40+90),(40+100+180)]=[140,320]

     */

    public static double[] calcMatrixXVector(double[] vector, List<double[]> matrix) {
        double[] vectorReturn = new double[2];

        int i = 0;
        for (double[] punto : matrix) {
            double dx = punto[0] * vector[0];
            double dy = punto[1] * vector[1];
            double dz = punto[2] * vector[2];

            vectorReturn[i] = dx + dy + dz;
            i++;
        }

        return vectorReturn;
    }

    public static void main(String[] args) {
        double[] vectorRef = {2.0, 3.1, 4.1};

        List<double[]> conjuntoPuntos = new ArrayList<>();
        conjuntoPuntos.add(new double[]{3.0, 4.0, 5.6});
        conjuntoPuntos.add(new double[]{-3.0, 4.0, 7.3});

        double[] vectorReturn = calcMatrixXVector(vectorRef, conjuntoPuntos);

        printValues(vectorReturn);
    }

    private static void printValues(double[] vectorReturn) {
        for(int i = 0; i< vectorReturn.length ; i++)
            System.out.println("El vector resultado es : " + vectorReturn[i]);
    }

}
