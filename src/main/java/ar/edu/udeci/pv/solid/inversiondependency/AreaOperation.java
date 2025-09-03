package ar.edu.udeci.pv.solid.inversiondependency;

import java.util.List;

public class AreaOperation {

    public static double area(ShapeArea shape){
        return shape.area();
    }

    public static double sumAreas(List<GeometricShape> shapes) {
        return shapes.stream().mapToDouble(s -> area(s)).sum();
    }
}
