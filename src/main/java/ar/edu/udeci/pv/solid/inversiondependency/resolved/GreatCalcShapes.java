package ar.edu.udeci.pv.solid.inversiondependency.resolved;

import java.util.List;

public class GreatCalcShapes {

    private double totalArea = 0;
    private double totalPerimeter = 0;

    public void calculate(List<GeometricShape> shapesList) {
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
