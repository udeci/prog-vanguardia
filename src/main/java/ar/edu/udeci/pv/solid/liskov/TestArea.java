package ar.edu.udeci.pv.solid.liskov;

public class TestArea {

    public static void main(String[] args) {
        Rectangle rectangle = new Square(5);
        rectangle.setWidth(7);
        rectangle.setHeight(5);
        System.out.println("Area: %s " + rectangle.area() + "  esperada: 25");
    }
}
