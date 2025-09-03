package ar.edu.udeci.pv.vector;

import java.util.ArrayList;
import java.util.List;

public class DistanciasEuclidianas {

    /*
    Enunciado: Escribe un programa que, dado un punto de referencia y un conjunto de puntos, devuelva un nuevo vector que contenga las distancias euclidianas
    de cada punto del conjunto al punto de referencia. La distancia euclidiana entre dos puntos P
P1(x1,y1) y P2(x2,y2) se calcula como
Raiz((x2 −x1)^2 +(y2−y1)^2)
 .
     */
    public static List<Double> calcularDistancias(double[] puntoReferencia, List<double[]> conjuntoPuntos) {
        List<Double> distancias = new ArrayList<>();

        for (double[] punto : conjuntoPuntos) {
            double dx = punto[0] - puntoReferencia[0];
            double dy = punto[1] - puntoReferencia[1];
            double distancia = Math.sqrt(dx * dx + dy * dy);
            distancias.add(distancia);
        }

        return distancias;
    }

    public static void main(String[] args) {
        double[] puntoReferencia = {0.0, 0.0};

        List<double[]> conjuntoPuntos = new ArrayList<>();
        conjuntoPuntos.add(new double[]{3.0, 4.0});
        conjuntoPuntos.add(new double[]{-3.0, 4.0});
        conjuntoPuntos.add(new double[]{0.0, -5.0});

        List<Double> distancias = calcularDistancias(puntoReferencia, conjuntoPuntos);

        System.out.println("El vector de distancias es: " + distancias);
    }
}
