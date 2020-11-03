package be.vdab.domain;

import be.vdab.enums.Color;

import java.util.Date;

public abstract class GeometricObject {
    private Color color;
    private boolean filled;
    private Date datecreated;

    protected GeometricObject() {
        datecreated = new Date();
    }

    protected GeometricObject(Color color, boolean filled) {
        this.color = color;
        this.filled = filled;
        datecreated = new Date();
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color= '" + color + '\'' +
                ", filled= " + filled +
                ", datecreated= " + datecreated +
                ", area= " + getArea() +
                ", perimeter= " + getPerimeter() +
                '}';
    }
}
