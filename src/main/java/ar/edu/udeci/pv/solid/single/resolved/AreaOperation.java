package ar.edu.udeci.pv.solid.single.resolved;

import java.util.List;

public class AreaOperation {

    public static double area(Rectangle rectangle){
        return rectangle.getWidth() * rectangle.getHeight();
    }

    public static double sumAreas(List<Rectangle> rectangles) {
        return rectangles.stream().mapToDouble(r -> area(r)).sum();
    }
}
