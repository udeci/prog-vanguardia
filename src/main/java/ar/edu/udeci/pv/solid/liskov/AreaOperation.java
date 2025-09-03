package ar.edu.udeci.pv.solid.liskov;

import java.util.List;

public class AreaOperation {

    public static double area(GeometricShape shape){
        return shape.area();
    }

    public static double sumAreas(List<GeometricShape> shapes) {
        return shapes.stream().mapToDouble(s -> area(s)).sum();
    }
}
