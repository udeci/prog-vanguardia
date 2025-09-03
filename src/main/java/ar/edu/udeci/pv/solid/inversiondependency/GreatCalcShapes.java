package ar.edu.udeci.pv.solid.inversiondependency;

import java.util.Arrays;
import java.util.List;

public class GreatCalcShapes {

    private double totalArea = 0;
    private double totalPerimeter = 0;

    public void calculate() {
        List<GeometricShape> shapesList = Arrays.asList(new Rectangle(12,23),
                new Square(7),new Rectangle(18,4),new EquilateralTriangle(8));
        totalArea = this.sumAreas(shapesList);
        totalPerimeter = this.sumPerimeter(shapesList);
    }

    public double sumAreas(List<GeometricShape> shapes) {
        return shapes.stream().mapToDouble(s -> AreaOperation.area(s)).sum();
    }

    public double sumPerimeter(List<GeometricShape> shapes) {
        return shapes.stream().mapToDouble(r -> PerimeterOperation.perimeter(r)).sum();
    }

    public double getTotalArea() {
        return totalArea;
    }

    public double getTotalPerimeter() {
        return totalPerimeter;
    }
}
