package be.vdab.collectionshfdstk21;

import be.vdab.collectionshfdstk20.Circle;
import be.vdab.collectionshfdstk20.GeometricObject;
import be.vdab.collectionshfdstk20.GeometricObjectComparator;
import be.vdab.collectionshfdstk20.Rectangle;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSetWithComparator {
    public static void main(String[] args) {
        Set<GeometricObject> setGeo = new TreeSet<>(new GeometricObjectComparator());
        setGeo.add(new Rectangle(4,5));
        setGeo.add(new Circle(40));
        setGeo.add(new Circle(40));
        setGeo.add(new Rectangle(4,1));

        System.out.println("sorted?");
        for (GeometricObject geoElement: setGeo) {
            System.out.println("area = "+ geoElement.getArea());

        }

    }

}
