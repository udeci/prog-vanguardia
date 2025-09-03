package ar.edu.udeci.pv.solid.liskov;

public class Square extends Rectangle{

    private Square(double x, double y) {
        super(x, y);
    }

    public Square(double x) {
        super(x, x);
    }
}
