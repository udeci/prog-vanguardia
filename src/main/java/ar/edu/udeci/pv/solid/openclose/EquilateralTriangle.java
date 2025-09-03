package ar.edu.udeci.pv.solid.openclose;

public class EquilateralTriangle implements Shape {

    private int side = 3;
    private int length;

    public EquilateralTriangle(int x) {
        length = x;
    }

    public int getSide() {
        return side;
    }

    public int getLength() {
        return length;
    }
}
