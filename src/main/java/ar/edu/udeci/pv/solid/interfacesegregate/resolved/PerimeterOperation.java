package ar.edu.udeci.pv.solid.interfacesegregate.resolved;

import java.util.List;

public class PerimeterOperation {

    public static double perimeter(ShapePerimeter shape){
        return shape.perimeter();
    }

    public static double sumPerimeter(List<GeometricShape> shapes) {
        return shapes.stream().mapToDouble(r -> perimeter(r)).sum();
    }
}
