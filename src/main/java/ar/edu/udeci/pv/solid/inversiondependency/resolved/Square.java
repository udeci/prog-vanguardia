package ar.edu.udeci.pv.solid.inversiondependency.resolved;

public class Square implements GeometricShape {

    private double side = 4;
    private double length;

    public Square(double x) {
        length = x;
    }

    public double getSide() {
        return side;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double area() {
        return Math.pow(length,2);
    }

    @Override
    public double perimeter() {
        return 4 * length;
    }
}
