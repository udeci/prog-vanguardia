package ar.edu.udeci.pv.test.simple_oop;

import java.util.*;

public class GreatCalcShapes {

    private double totalArea = 0;

    public void calculate(List<GeometricShape> shapesList) {
        totalArea = this.sumAreas(shapesList);
    }

    public double sumAreas(List<GeometricShape> shapes) {
        return shapes.stream().mapToDouble(s -> AreaOperation.area(s)).sum();
    }

    public double getTotalArea() {
        return totalArea;
    }

}
