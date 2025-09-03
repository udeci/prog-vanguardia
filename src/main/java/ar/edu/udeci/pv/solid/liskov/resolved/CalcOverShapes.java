package ar.edu.udeci.pv.solid.liskov.resolved;

import java.util.Arrays;
import java.util.List;

public class CalcOverShapes {

    public static void main(String[] args) {
        List<GeometricShape> shapesList = Arrays.asList(new Rectangle(12,23),new Rectangle(7,5),new Rectangle(18,4));
        double sumArea = AreaOperation.sumAreas(shapesList);
        double sumPerimeter = PerimeterOperation.sumPerimeter(shapesList);
        System.out.println("Area: %s " + sumArea + "  perimeter:" + sumPerimeter);
    }

}
