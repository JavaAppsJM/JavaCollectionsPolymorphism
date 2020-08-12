package be.vdab.collections;

import java.awt.*;
import java.util.Comparator;

import static java.lang.Math.max;

public class TestComparator {
    public static void main(String[] args) {
        GeometricObject g1 = new Rectangle(5,5);
        GeometricObject g2 = new Circle(5);
        GeometricObject g = max(g1,g2,new GeometricObjectComparator());

        System.out.println("larger object is : " + g.getArea());
    }

    public static GeometricObject max
            (GeometricObject g1, GeometricObject g2, Comparator c) {
        if (c.compare(g1,g2) > 0){
            return g1;
        }else{
            return g2;
        }
    }
}
