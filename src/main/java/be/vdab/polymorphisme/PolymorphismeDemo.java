package be.vdab.polymorphisme;

import be.vdab.domain.Circle;
import be.vdab.domain.Color;
import be.vdab.domain.GeometricObject;
import be.vdab.domain.Rectangle;

public class PolymorphismeDemo {
    public static void main(String[] args) {
        GeometricObject g1 = new Circle(4, Color.GREEN, true);
        GeometricObject g2 = new Rectangle(Color.RED, false,8,9.4);

        displayObject(g1);
        displayObject(g2);
    }

    // laat gelijk welk type geometricObject zien omdat de pointer vn type geometricObject is
    // en gedraagt zich anders naargelang Rectangle of Circle !!
    public static void displayObject(GeometricObject geometricObject){
        System.out.println(geometricObject.toString());
    }
}
