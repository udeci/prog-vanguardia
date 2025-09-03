package ar.edu.udeci.pv.solid.openclose;

import java.util.Arrays;
import java.util.List;

public class CalcOverShapes {

    public static void main(String[] args) {
        List<Shape> rectangles = Arrays.asList(new Rectangle(12,23),new Rectangle(7,5),new Rectangle(18,4));
        double sumArea = AreaOperation.sumAreas(rectangles);
        double sumPerimeter = PerimeterOperation.sumPerimeter(rectangles);
        System.out.println("Area: %s " + sumArea + "  perimeter:" + sumPerimeter);
    }

}
