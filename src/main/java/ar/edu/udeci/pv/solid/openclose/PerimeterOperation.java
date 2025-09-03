package ar.edu.udeci.pv.solid.openclose;

import java.util.List;

public class PerimeterOperation {

    public static double perimeter(Shape shape){
        if(shape instanceof Rectangle) {
            return 2 * (((Rectangle) shape).getWidth() + ((Rectangle) shape).getHeight());
        }else if(shape instanceof EquilateralTriangle){
            return  ((EquilateralTriangle)shape).getLength() * 3;
        }
        return 0;
    }

    public static double sumPerimeter(List<Shape> shapes) {
        return shapes.stream().mapToDouble(r -> perimeter(r)).sum();
    }
}
