package ar.edu.udeci.pv.test.simple_oop;

public class EquilateralTriangle implements GeometricShape {

    private double side = 3;
    private double length;

    public EquilateralTriangle(double x) {
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
        return  Math.sqrt(3)* Math.pow(this.getLength(),2)/4;
    }

}
