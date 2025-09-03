package ar.edu.udeci.pv.solid.single;

import java.util.List;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int x, int y) {
        height = y;
        width = x;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public static double area(Rectangle rectangle){
        return rectangle.getWidth() * rectangle.getHeight();
    }

    public static double perimeter(Rectangle rectangle){
        return 2 * (rectangle.getWidth() + rectangle.getHeight());
    }

    public static double sumAreas(List<Rectangle> rectangles) {
        return rectangles.stream().mapToDouble(r -> Rectangle.area(r)).sum();
    }

    public static double sumPerimeter(List<Rectangle> rectangles) {
        return rectangles.stream().mapToDouble(r -> Rectangle.perimeter(r)).sum();
    }
}
