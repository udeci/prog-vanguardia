package ar.edu.udeci.pv.solid.openclose;

public class Rectangle implements Shape {

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

}
