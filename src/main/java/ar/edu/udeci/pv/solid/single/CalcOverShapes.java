package ar.edu.udeci.pv.solid.single;

import java.util.Arrays;
import java.util.List;

public class CalcOverShapes {

    public static void main(String[] args) {
        List<Rectangle> rectangles =
                Arrays.asList(new Rectangle(12,23),new Rectangle(7,5),new Rectangle(18,4));
        double sumArea = Rectangle.sumAreas(rectangles);
        double sumPerimeter = Rectangle.sumPerimeter(rectangles);
        System.out.println("Area: %s " + sumArea + "  perimeter:" + sumPerimeter);
    }

}
