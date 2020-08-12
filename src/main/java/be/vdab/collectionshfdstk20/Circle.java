package be.vdab.collectionshfdstk20;

public class Circle extends GeometricObject{
    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * PI;
    }

    @Override
    public double getPerimeter() {
        return 2*(radius * PI);
    }
}
