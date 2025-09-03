package ar.edu.udeci.pv.solid.inversiondependency;

public class Rectangle implements GeometricShape {

    private double width;
    private double height;

    public Rectangle(double x, double y) {
        height = y;
        width = x;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}
