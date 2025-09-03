package ar.edu.udeci.pv.solid.openclose;

import java.util.List;

public class AreaOperation {

    public static double area(Shape shape){
        if(shape instanceof Rectangle) {
            return ((Rectangle) shape).getWidth() * ((Rectangle) shape).getHeight();
        }else if(shape instanceof EquilateralTriangle){
            return  Math.sqrt(3)* Math.pow(((EquilateralTriangle)shape).getLength(),2)/4;
        }
        return 0;
    }

    public static double sumAreas(List<Shape> shapes) {
        return shapes.stream().mapToDouble(s -> area(s)).sum();
    }
}
