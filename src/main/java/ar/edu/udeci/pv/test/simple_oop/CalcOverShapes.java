package ar.edu.udeci.pv.test.simple_oop;

import java.util.*;

public class CalcOverShapes {

    public static void main(String[] args) {
        GreatCalcShapes greatCalcShapes = new GreatCalcShapes();
        greatCalcShapes.calculate(getShapesList());
        System.out.println("Area: " + greatCalcShapes.getTotalArea() );
    }


    private static List<GeometricShape> getShapesList() {
        List<GeometricShape> geometricShapeList = new ArrayList<>();
        geometricShapeList.add(new Rectangle(12,23));
        return geometricShapeList;
    }

}
