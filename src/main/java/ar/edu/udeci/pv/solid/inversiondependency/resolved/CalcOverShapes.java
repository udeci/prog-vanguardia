package ar.edu.udeci.pv.solid.inversiondependency.resolved;

import java.util.Arrays;
import java.util.List;

public class CalcOverShapes {

    public static void main(String[] args) {
        GreatCalcShapes greatCalcShapes = new GreatCalcShapes();
        greatCalcShapes.calculate(getShapesList());
        System.out.println("Area: " + greatCalcShapes.getTotalArea() + "  perimeter:"
                + greatCalcShapes.getTotalPerimeter());
    }

    private static List<GeometricShape> getShapesList() {
        return Arrays.asList(new Rectangle(12,23),new Square(7),
                new Rectangle(18,4),new EquilateralTriangle(8));
    }

}
