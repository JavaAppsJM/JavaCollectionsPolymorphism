package be.vdab.domain;

import be.vdab.enums.Color;

public class Circle extends GeometricObject {
    private double radius;
    private final static double PI = 3.14;

    public Circle(double radius, Color color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

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

    @Override
    public String toString() {
        return super.toString() + " Circle{" +
                "radius=" + radius +
                '}';
    }
}
